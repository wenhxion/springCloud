package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("orderList")
    public String orderList(){
        return "consumer获取信息："+restTemplate.getForObject("http://order-service/order/list",String.class);
    }

}
