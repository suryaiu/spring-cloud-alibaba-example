package me.alphar.sca.account.controller;

import me.alphar.sca.account.service.ISeataAccountService;
import me.alphar.sca.common.entity.SeataAccount;
import me.alphar.sca.common.util.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class SeataOrderController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private ISeataAccountService seataAccountService;

    @PostMapping
    public CommonResult<SeataAccount> createOrder(SeataAccount seataAccount) {
        seataAccountService.update(seataAccount);
        SeataAccount account = seataAccountService.getById(seataAccount.getId());
        return new CommonResult<>(200, "操作成功，服务器端口：" + serverPort, account);
    }

}
