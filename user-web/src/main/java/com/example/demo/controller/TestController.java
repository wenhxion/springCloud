package com.example.demo.controller;

import com.example.demo.consumer.OrderConsumer;
import com.example.demo.consumer.UserConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserConsumer userConsumer;

    @Autowired
    private OrderConsumer orderConsumer;

    @GetMapping("show")
    public String show(){
        String user = userConsumer.list();
        String order = orderConsumer.list();
        return String.format("consumer获取信息：用户信息：%s，订单信息：%s",user,order);
    }
}
