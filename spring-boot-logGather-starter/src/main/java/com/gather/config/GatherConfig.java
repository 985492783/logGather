package com.gather.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author qiyue.zhang@aloudata.com
 * @description GatherConfig
 * @date 2023/5/2 22:53
 */

@ConfigurationProperties(prefix = "gather")
@EnableDubbo(scanBasePackages = "com.gather")
public class GatherConfig {
    private boolean enable = true;
    
    public boolean isEnable() {
        return enable;
    }
    
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
