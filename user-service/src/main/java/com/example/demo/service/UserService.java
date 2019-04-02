package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String list(){
        return "[{uid:1,name:'zhangsan'},{uid:2,name:'lisi'}]";
    }
}
