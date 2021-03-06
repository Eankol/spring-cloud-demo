package com.eankol.confclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfclientApplication.class, args);
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/in")
    public String in(){
        return foo;
    }

}
