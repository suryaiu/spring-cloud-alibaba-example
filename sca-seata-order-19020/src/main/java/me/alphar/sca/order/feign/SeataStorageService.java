package me.alphar.sca.order.feign;

import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.sca.common.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Component
@FeignClient(name = "seata-storage")
public interface SeataStorageService {

    @PutMapping
    CommonResult<SeataStorage> update(SeataStorage seataStorage);

    @GetMapping("{productId}")
    CommonResult<SeataStorage> getByProductId(@PathVariable("productId") Long productId);
}
