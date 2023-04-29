package com.gather.controller;

import com.gather.factory.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 985492783@qq.com
 * @date 2023/4/29 15:44
 */
@RestController
public class TestController {
    private final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    
    @GetMapping("/get")
    public String test() {
        LOGGER.info("hello");
        return "";
    }
}
