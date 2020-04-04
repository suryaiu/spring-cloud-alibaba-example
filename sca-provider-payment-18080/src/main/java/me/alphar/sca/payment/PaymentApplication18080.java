package me.alphar.sca.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication18080 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication18080.class, args);
    }
}
