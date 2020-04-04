package me.alphar.sca.order.service.impl;

import me.alphar.sca.common.entity.SeataOrder;
import me.alphar.sca.order.dao.SeataOrderDao;
import me.alphar.sca.order.service.ISeataOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SeataOrderServiceImpl implements ISeataOrderService {

    @Resource
    private SeataOrderDao seataOrderDao;

    @Override
    public int save(SeataOrder seataStorage) {

        return seataOrderDao.save(seataStorage);
    }

    @Override
    public SeataOrder getById(Long id) {
        return seataOrderDao.getById(id);
    }
}
