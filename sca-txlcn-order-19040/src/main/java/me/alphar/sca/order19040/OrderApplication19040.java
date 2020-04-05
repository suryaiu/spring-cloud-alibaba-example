package me.alphar.sca.order19040;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
public class OrderApplication19040 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication19040.class, args);
    }
}
