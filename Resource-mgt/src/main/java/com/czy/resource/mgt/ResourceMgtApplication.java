package com.czy.resource.mgt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableFeignClients(basePackages = "com.czy.commons.remote")
@SpringBootApplication
public class ResourceMgtApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceMgtApplication.class, args);
        log.info("【资源管理】启动成功");
    }
}
