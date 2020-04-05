package me.alphar.txlcn.storage19061.service;

import me.alphar.sca.common.entity.SeataStorage;

public interface IStorageService {

    int update(SeataStorage seataStorage);

    SeataStorage getById(Long id);

    SeataStorage getByProductId(Long productId);
}
