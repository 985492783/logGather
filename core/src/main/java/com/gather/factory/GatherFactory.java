package com.gather.factory;

import org.slf4j.Logger;

/**
 * @author 985492783@qq.com
 * @date 2023/4/29 16:27
 */
public abstract class GatherFactory {
    
    public static GatherInterface gatherFactory;
    
    private static final String FACTORY_TYPE = System.getProperty("log.gather.type", "http");
    
    static {
        if ("http".equals(FACTORY_TYPE)) {
            gatherFactory = new HttpGatherFactory();
        } else if("dubbo".equals(FACTORY_TYPE)) {
            gatherFactory = new HttpGatherFactory();
        } else {
            gatherFactory = new HttpGatherFactory();
        }
    }
    
}
