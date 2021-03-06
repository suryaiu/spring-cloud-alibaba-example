package me.alphar.txlcn.account19050.service;

import me.alphar.sca.common.entity.SeataAccount;

public interface IAccountService {

    int update(SeataAccount seataOrder);
    SeataAccount getById(Long id);

    SeataAccount getByUserId(Long userId);
}
