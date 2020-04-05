package me.alphar.txlcn.storage19061.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.txlcn.storage19061.dao.StorageDao;
import me.alphar.txlcn.storage19061.service.IStorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements IStorageService {

    @Resource
    private StorageDao seataStorageDao;

    @Transactional
    @LcnTransaction(propagation = DTXPropagation.REQUIRED)
    @Override
    public int update(SeataStorage seataStorage) {
        return seataStorageDao.update(seataStorage);
    }

    @Override
    public SeataStorage getById(Long id) {
        return seataStorageDao.getById(id);
    }

    @Override
    public SeataStorage getByProductId(Long productId) {
        return seataStorageDao.getByProductId(productId);
    }
}
