package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyGatewayServerApp {
    public static void main(String[] args) {
        SpringApplication.run(MyGatewayServerApp.class, args);
    }
}
