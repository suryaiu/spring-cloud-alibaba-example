package me.alphar.txlcn.account19051.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import me.alphar.txlcn.account19051.dao.AccountDao;
import me.alphar.txlcn.account19051.service.IAccountService;
import me.alphar.sca.common.entity.SeataAccount;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements IAccountService {

    @Resource
    private AccountDao seataAccountDao;

    @Transactional
    @LcnTransaction(propagation = DTXPropagation.REQUIRED)
    @Override
    public int update(SeataAccount seataAccount) {
        return seataAccountDao.update(seataAccount);
    }

    @Override
    public SeataAccount getById(Long id) {
        return seataAccountDao.getById(id);
    }

    @Override
    public SeataAccount getByUserId(Long userId) {
        return seataAccountDao.getByUserId(userId);
    }
}
