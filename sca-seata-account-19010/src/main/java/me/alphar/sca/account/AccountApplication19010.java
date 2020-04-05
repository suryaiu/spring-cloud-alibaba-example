package me.alphar.sca.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class AccountApplication19010 {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication19010.class, args);
    }
}
