package me.alphar.sca.order.feign;

import me.alphar.sca.common.entity.SeataAccount;
import me.alphar.sca.common.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Component
@FeignClient(name = "seata-account")
public interface SeataAccountService {

    @PutMapping
    CommonResult<SeataAccount> update(SeataAccount seataAccount);

    @GetMapping("{userId}")
    CommonResult<SeataAccount> getByUserId(@PathVariable("userId") Long userId);
}
