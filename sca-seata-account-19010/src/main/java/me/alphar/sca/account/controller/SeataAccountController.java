package me.alphar.sca.account.controller;

import me.alphar.sca.account.service.ISeataAccountService;
import me.alphar.sca.common.entity.SeataAccount;
import me.alphar.sca.common.util.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/account")
public class SeataAccountController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private ISeataAccountService seataAccountService;

    @PutMapping
    public CommonResult<SeataAccount> update(SeataAccount seataAccount) {
        int update = seataAccountService.update(seataAccount);
        if (update!=1) {
            throw new RuntimeException("更新数据失败");
        }
        SeataAccount account = seataAccountService.getById(seataAccount.getId());
        return new CommonResult<>(200, "操作成功，服务器端口：" + serverPort, account);
    }

    @GetMapping("{userId}")
    public CommonResult<SeataAccount> getByUserId(@PathVariable("userId") Long userId) {
        SeataAccount account = seataAccountService.getByUserId(userId);
        return new CommonResult<>(200, "查询成功，服务器端口：" + serverPort, account);
    }
}
