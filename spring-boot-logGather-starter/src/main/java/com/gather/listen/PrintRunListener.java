package com.gather.listen;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;

/**
 * @author 985492783@qq.com
 * @date 2023/5/5 1:48
 */
public class PrintRunListener implements SpringApplicationRunListener {
    
    public PrintRunListener(SpringApplication application, String[] args) {
    
    }
    
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println(1);
    }
}
