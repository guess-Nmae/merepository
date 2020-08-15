package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:15
 */
@SpringBootApplication
@EnableFeignClients
public class ConSumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConSumerApp.class,args);
    }
}
