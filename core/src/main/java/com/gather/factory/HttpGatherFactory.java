package com.gather.factory;

import com.gather.proxy.HttpGatherLogger;
import org.slf4j.Logger;

/**
 * @author 985492783@qq.com
 * @date 2023/4/29 16:28
 */
public class HttpGatherFactory implements GatherInterface{
    
    @Override
    public Logger proxy(Logger Logger) {
        return new HttpGatherLogger(Logger);
    }
}
