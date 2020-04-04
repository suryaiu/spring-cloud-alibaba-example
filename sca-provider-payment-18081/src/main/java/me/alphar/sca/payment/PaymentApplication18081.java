package me.alphar.sca.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication18081 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication18081.class, args);
    }
}
