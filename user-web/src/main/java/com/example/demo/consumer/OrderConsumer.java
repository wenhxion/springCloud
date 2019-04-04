package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("order-service")
public interface OrderConsumer {

    @GetMapping("/order/list")
    String list();

}
