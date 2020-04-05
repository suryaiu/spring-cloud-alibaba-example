package me.alphar.txlcn.account19051;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
public class AccountApplication19051 {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication19051.class, args);
    }
}
