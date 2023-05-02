package com.gather.facade.impl;

import com.gather.facade.TraceIdFacade;
import com.gather.utils.TraceIdUtils;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author qiyue.zhang@aloudata.com
 * @description TraceIdFacadeImpl
 * @date 2023/5/2 23:19
 */
@DubboService(version = "1.0.0")
public class TraceIdFacadeImpl implements TraceIdFacade {
    
    @Override
    public String getTraceId() {
        return TraceIdUtils.getTraceId();
    }

}
