package com.gather.processor;

import com.gather.factory.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * @author qiyue.zhang@aloudata.com
 * @description GatherBeanProcessor
 * @date 2023/5/2 22:58
 */
public class GatherBeanProcessor implements BeanPostProcessor {
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if(field.getType().equals(Logger.class)) {
                field.setAccessible(true);
                try {
                    Object logger = field.get(bean);
                    if(logger != null && !logger.getClass().equals(com.gather.proxy.HttpGatherLogger.class)) {
                        Logger proxy = LoggerFactory.proxy((Logger) logger);
                        field.set(bean, proxy);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return bean;
    }
}
