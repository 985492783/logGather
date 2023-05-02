package com.gather.config;

import com.gather.filter.TraceFilter;
import com.gather.processor.GatherBeanProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiyue.zhang@aloudata.com
 * @description GatherConfig
 * @date 2023/5/2 21:45
 */
@Configuration
@EnableConfigurationProperties(GatherConfig.class)
public class GatherConfiguration {
    
    @Bean
    public FilterRegistrationBean<TraceFilter> webAuthFilterRegistration() {
        FilterRegistrationBean<TraceFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(traceFilter());
        registration.setName("traceFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(-1);
        return registration;
    }
    
    @Bean
    public GatherBeanProcessor gatherBeanProcessor() {
        return new GatherBeanProcessor();
    }
    
    @Bean
    public TraceFilter traceFilter() {
        return new TraceFilter();
    }
}
