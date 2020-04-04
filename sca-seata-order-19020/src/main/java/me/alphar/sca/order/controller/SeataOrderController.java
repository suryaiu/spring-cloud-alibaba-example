package me.alphar.sca.order.controller;

import me.alphar.sca.common.entity.SeataOrder;
import me.alphar.sca.common.util.CommonResult;
import me.alphar.sca.order.service.ISeataOrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class SeataOrderController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private ISeataOrderService seataOrderService;

    @PostMapping
    public CommonResult<SeataOrder> createOrder(SeataOrder seataOrder) {
        seataOrderService.save(seataOrder);
        SeataOrder storage = seataOrderService.getById(seataOrder.getId());
        return new CommonResult<>(200, "操作成功，服务器端口：" + serverPort, storage);
    }

}
