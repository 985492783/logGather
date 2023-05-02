package com.gather.facade.impl;

import com.gather.facade.GatherFacade;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author qiyue.zhang@aloudata.com
 * @description GatherFacadeImpl
 * @date 2023/5/2 15:25
 */
@DubboService(version = "1.0.0")
public class GatherFacadeImpl implements GatherFacade {
    
    @Override
    public void gather() {
        System.out.println(1);
    }
}
