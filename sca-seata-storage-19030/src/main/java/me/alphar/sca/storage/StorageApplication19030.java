package me.alphar.sca.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class StorageApplication19030 {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication19030.class, args);
    }
}
