package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String list(){
        return "[{no:1,time:2018},{no:2,time:2019}]";
    }

}
