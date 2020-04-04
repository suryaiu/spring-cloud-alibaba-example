package me.alphar.sca.account.service;

import me.alphar.sca.common.entity.SeataAccount;

public interface ISeataAccountService {

    int update(SeataAccount seataOrder);
    SeataAccount getById(Long id);

}
