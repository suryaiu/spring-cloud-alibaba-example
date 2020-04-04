package me.alphar.sca.order.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String provideUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public String test(@PathVariable("id") Long id) {
        return restTemplate.getForObject(provideUrl + "/payment/" + id, String.class);
    }

    @GetMapping("/test/a")
    public String test_a() {
        return "------- test-a --------";
    }

    @GetMapping("/test/b")
    public String test_b() {
        return "------- test-b --------";
    }
}
