package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("userlist")
    public String userlist(){
        return "consumer获取信息："+restTemplate.getForObject("http://user-service/user/list",String.class);
    }
}
