package com.gather;

import com.gather.config.TestConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author qiyue.zhang@aloudata.com
 * @description Main
 * @date 2023/4/30 01:08
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.gather.facade.impl")
@Import(TestConfig.class)
public class Main {
    
    public static void main(String[] args) {
        System.setProperty("DUBBO_IP_TO_REGISTRY", "124.220.171.130");
        SpringApplication.run(Main.class, args);
    }
}
