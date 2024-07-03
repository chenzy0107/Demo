package com.czy.user.mgt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class UserMgtApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserMgtApplication.class, args);
        log.info("【用户中心】启动成功");
    }
}