package com.eankol.eurekaclent3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclent3Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclent3Application.class, args);
    }

}
