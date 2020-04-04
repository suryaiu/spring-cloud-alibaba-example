package me.alphar.sca.account.service.impl;

import me.alphar.sca.account.dao.SeataAccountDao;
import me.alphar.sca.account.service.ISeataAccountService;
import me.alphar.sca.common.entity.SeataAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SeataAccountServiceImpl implements ISeataAccountService {

    @Resource
    private SeataAccountDao seataAccountDao;

    @Override
    public int update(SeataAccount seataAccount) {

        return seataAccountDao.update(seataAccount);
    }

    @Override
    public SeataAccount getById(Long id) {
        return seataAccountDao.getById(id);
    }
}
