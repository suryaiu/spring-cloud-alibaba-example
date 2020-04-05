package me.alphar.sca.order19040.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import me.alphar.sca.common.entity.SeataAccount;
import me.alphar.sca.common.entity.SeataOrder;
import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.sca.common.util.CommonResult;
import me.alphar.sca.order19040.dao.SeataOrderDao;
import me.alphar.sca.order19040.feign.SeataAccountService;
import me.alphar.sca.order19040.feign.SeataStorageService;
import me.alphar.sca.order19040.service.ISeataOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class SeataOrderServiceImpl implements ISeataOrderService {

    @Resource
    private SeataOrderDao seataOrderDao;

    @Resource
    private SeataAccountService seataAccountService;

    @Resource
    private SeataStorageService seataStorageService;

    @Transactional
    @LcnTransaction(propagation = DTXPropagation.REQUIRED)
    @Override
    public int save(SeataOrder seataOrder) {
        // 第一步：扣除用户账户
        Long userId = seataOrder.getUserId();
        CommonResult<SeataAccount> result = seataAccountService.getByUserId(userId);
        // 判断余额是否充足
        SeataAccount account = result.getData();
        if (account.getResidue().compareTo(seataOrder.getMoney()) < 0) {
            System.out.println("余额不足");
            throw new RuntimeException("余额不足");
        }
        BigDecimal residue = account.getResidue();
        BigDecimal used = account.getUsed();
        account.setUsed(used.add(seataOrder.getMoney()));
        account.setResidue(residue.subtract(seataOrder.getMoney()));
        seataAccountService.update(account);
        // 第二步：更新库存
        Integer count = seataOrder.getCount();
        CommonResult<SeataStorage> storageResult = seataStorageService.getByProductId(seataOrder.getProductId());
        SeataStorage storage = storageResult.getData();
        if (storage.getResidue() < count) {
            System.out.println("库存不足");
            throw new RuntimeException("库存不足");
        }
        Integer used1 = storage.getUsed();
        Integer residue1 = storage.getResidue();
        storage.setUsed(used1 + seataOrder.getCount());
        storage.setResidue(residue1 - seataOrder.getCount());
        seataStorageService.update(storage);

        // 最后生成订单
        return seataOrderDao.save(seataOrder);
    }

    @Override
    public SeataOrder getById(Long id) {
        return seataOrderDao.getById(id);
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(100);
        BigDecimal b = new BigDecimal(200);

        System.out.println(a.compareTo(b));
    }
}
