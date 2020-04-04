package me.alphar.sca.storage.service;

import me.alphar.sca.common.entity.SeataStorage;

public interface ISeataStorageService {

    int update(SeataStorage seataStorage);
    SeataStorage getById(Long id);

}
