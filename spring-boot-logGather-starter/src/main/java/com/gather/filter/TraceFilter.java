package com.gather.filter;

import com.gather.cache.TraceCache;
import com.gather.facade.TraceIdFacade;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author qiyue.zhang@aloudata.com
 * @description TraceFilter
 * @date 2023/5/2 21:46
 */
public class TraceFilter implements Filter {
    
    @DubboReference(version = "1.0.0")
    private TraceIdFacade traceIdFacade;
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            TraceCache.setTraceId(traceIdFacade.getTraceId());
            if(TraceCache.getTraceId()!=null) {
                ((HttpServletResponse) response).setHeader("traceId", TraceCache.getTraceId());
            }
            chain.doFilter(request,response);
        }finally {
            TraceCache.clear();
        }
    }
    
}
