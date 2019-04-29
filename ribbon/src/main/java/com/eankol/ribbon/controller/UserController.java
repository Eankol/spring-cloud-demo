package com.eankol.ribbon.controller;

import com.eankol.ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService serv;
    @GetMapping("hi")
    public String hi(String name){
        return serv.hi(name);
    }
}
