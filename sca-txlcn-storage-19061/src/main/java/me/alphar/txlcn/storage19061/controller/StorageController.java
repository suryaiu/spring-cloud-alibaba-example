package me.alphar.txlcn.storage19061.controller;

import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.sca.common.util.CommonResult;
import me.alphar.txlcn.storage19061.service.IStorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private IStorageService seataStorageService;

    /**
     * 更新库存操作，更新成功后将新的库存信息返回
     * @param seataStorage 库存数据
     * @return 新的库存数据
     */
    @PutMapping
    public CommonResult<SeataStorage> update(@RequestBody SeataStorage seataStorage) {
        seataStorageService.update(seataStorage);
        SeataStorage storage = seataStorageService.getById(seataStorage.getId());
        return new CommonResult<>(200, "操作成功，服务器端口：" + serverPort, storage);
    }

    @GetMapping("{productId}")
    public CommonResult<SeataStorage> getByProductId(@PathVariable("productId") Long productId) {
        SeataStorage storage = seataStorageService.getByProductId(productId);
        return new CommonResult<>(200, "查询成功，服务器端口：" + serverPort, storage);
    }

}
