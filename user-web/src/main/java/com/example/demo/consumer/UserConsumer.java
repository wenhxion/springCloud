package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user-service")
public interface UserConsumer {

    @GetMapping("/user/list")
    String list();

}
