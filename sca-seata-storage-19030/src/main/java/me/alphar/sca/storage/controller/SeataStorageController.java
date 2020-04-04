package me.alphar.sca.storage.controller;

import me.alphar.sca.common.entity.SeataStorage;
import me.alphar.sca.common.util.CommonResult;
import me.alphar.sca.storage.service.ISeataStorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/storage")
public class SeataStorageController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private ISeataStorageService seataStorageService;

    /**
     * 更新库存操作，更新成功后将新的库存信息返回
     * @param seataStorage 库存数据
     * @return 新的库存数据
     */
    @PutMapping
    public CommonResult<SeataStorage> update(SeataStorage seataStorage) {
        seataStorageService.update(seataStorage);
        SeataStorage storage = seataStorageService.getById(seataStorage.getId());
        return new CommonResult<>(200, "操作成功，服务器端口：" + serverPort, storage);
    }

}
