package com.eankol.eurekaclent2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Eurekaclent2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclent2Application.class, args);
    }
    @Value("${server.port}")
    String port;
    @RequestMapping("/init")
    public String getinit(){
        return "hi";
    }

}
