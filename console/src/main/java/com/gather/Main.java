package com.gather;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qiyue.zhang@aloudata.com
 * @description Main
 * @date 2023/4/30 01:08
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.gather.facade.impl")
public class Main {
    
    public static void main(String[] args) {
        System.setProperty("DUBBO_IP_TO_REGISTRY", "124.220.171.130");
        SpringApplication.run(Main.class, args);
    }
}
