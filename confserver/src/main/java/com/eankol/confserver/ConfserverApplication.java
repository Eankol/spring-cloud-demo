package com.eankol.confserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfserverApplication.class, args);
    }

}
