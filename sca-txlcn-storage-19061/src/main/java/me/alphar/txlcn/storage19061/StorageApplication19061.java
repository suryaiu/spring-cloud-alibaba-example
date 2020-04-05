package me.alphar.txlcn.storage19061;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
public class StorageApplication19061 {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication19061.class, args);
    }
}
