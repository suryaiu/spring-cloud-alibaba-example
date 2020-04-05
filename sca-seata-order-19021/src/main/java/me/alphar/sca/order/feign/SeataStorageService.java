package me.alphar.sca.order.feign;

import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.sca.common.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "seata-storage")
public interface SeataStorageService {

    @PutMapping("/storage")
    CommonResult<SeataStorage> update(@RequestBody SeataStorage seataStorage);

    @GetMapping("/storage/{productId}")
    CommonResult<SeataStorage> getByProductId(@PathVariable("productId") Long productId);
}
