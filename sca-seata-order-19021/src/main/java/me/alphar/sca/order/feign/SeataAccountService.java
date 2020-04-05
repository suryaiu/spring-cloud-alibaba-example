package me.alphar.sca.order.feign;

import me.alphar.sca.common.entity.SeataAccount;
import me.alphar.sca.common.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "seata-account")
public interface SeataAccountService {

    @PutMapping("/account")
    CommonResult<SeataAccount> update(@RequestBody SeataAccount seataAccount);

    @GetMapping("/account/{userId}")
    CommonResult<SeataAccount> getByUserId(@PathVariable("userId") Long userId);
}
