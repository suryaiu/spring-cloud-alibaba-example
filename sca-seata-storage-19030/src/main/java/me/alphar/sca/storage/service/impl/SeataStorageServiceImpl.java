package me.alphar.sca.storage.service.impl;

import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.sca.storage.dao.SeataStorageDao;
import me.alphar.sca.storage.service.ISeataStorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SeataStorageServiceImpl implements ISeataStorageService {

    @Resource
    private SeataStorageDao seataStorageDao;

    @Override
    public int update(SeataStorage seataStorage) {

        return seataStorageDao.update(seataStorage);
    }

    @Override
    public SeataStorage getById(Long id) {
        return seataStorageDao.getById(id);
    }
}
