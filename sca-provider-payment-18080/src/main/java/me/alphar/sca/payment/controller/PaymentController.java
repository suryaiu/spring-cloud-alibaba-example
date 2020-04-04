package me.alphar.sca.payment.controller;

import me.alphar.sca.payment.entities.CommonResult;
import me.alphar.sca.payment.entities.Payment;
import me.alphar.sca.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:36
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping
    public CommonResult save(Payment payment) {
        int result = paymentService.save(payment);
        return new CommonResult(1, "successful from:" + serverPort, result);
    }

    @GetMapping("{tid}")
    public CommonResult<Payment> getById(@PathVariable("tid") Long tid) {
        Payment result = paymentService.getById(tid);
        return new CommonResult(1, "successful from:" + serverPort, result);
    }


    @GetMapping("test")
    public String paymentZk() {
        return "spring-cloud with eureka: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
