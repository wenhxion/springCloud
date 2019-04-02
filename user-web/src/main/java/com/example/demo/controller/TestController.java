package com.example.demo.controller;

import com.example.demo.consumer.OrderService;
import com.example.demo.consumer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @GetMapping("show")
    public String show(){
        String user = userService.list();
        String order = orderService.list();
        return String.format("consumer获取信息：用户信息：%s，订单信息：%s",user,order);
    }
}
