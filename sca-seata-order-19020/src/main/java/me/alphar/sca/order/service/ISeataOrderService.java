package me.alphar.sca.order.service;

import me.alphar.sca.common.entity.SeataOrder;

public interface ISeataOrderService {

    int save(SeataOrder seataOrder);
    SeataOrder getById(Long id);

}
