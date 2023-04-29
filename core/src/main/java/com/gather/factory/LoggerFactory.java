package com.gather.factory;


import org.slf4j.Logger;

/**
 * @author 985492783@qq.com
 * @date 2023/4/29 15:54
 */
public class LoggerFactory {
    
    
    public static Logger proxy(Logger Logger) {
        return GatherFactory.gatherFactory.proxy(Logger);
    }
    
    public static Logger getLogger(String name) {
        return proxy(org.slf4j.LoggerFactory.getLogger(name));
    }
    
    public static Logger getLogger(Class<?> clazz) {
        return proxy(org.slf4j.LoggerFactory.getLogger(clazz));
    }
    
}
