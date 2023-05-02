package com.gather.utils;

import cn.hutool.core.util.IdUtil;

/**
 * @author qiyue.zhang@aloudata.com
 * @description TraceIdUtils
 * @date 2023/5/2 23:20
 */
public class TraceIdUtils {
    
    public static String getTraceId() {
        String fastSimpleUUID = IdUtil.fastSimpleUUID();
        String timeTemplate = String.valueOf(System.currentTimeMillis());
        return fastSimpleUUID + "." + timeTemplate;
    }
}
