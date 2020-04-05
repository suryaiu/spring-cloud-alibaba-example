package me.alphar.sca.order19041.service;

import me.alphar.sca.common.entity.SeataOrder;

public interface ISeataOrderService {

    int save(SeataOrder seataOrder);
    SeataOrder getById(Long id);

}
