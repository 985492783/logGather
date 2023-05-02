package com.gather.proxy;

import org.slf4j.Logger;
import org.slf4j.Marker;
import static com.gather.cache.TraceCache.getTrace;
/**
 * @author 985492783@qq.com
 * @date 2023/4/29 15:57
 */
public class HttpGatherLogger implements Logger {
    
    private final Logger Logger;
    
    public HttpGatherLogger(Logger Logger) {
        this.Logger = Logger;
    }
    
    @Override
    public String getName() {
        return Logger.getName();
    }
    
    @Override
    public boolean isTraceEnabled() {
        return Logger.isTraceEnabled();
    }
    
    @Override
    public void trace(String s) {
        Logger.trace(getTrace() + s);
    }
    
    @Override
    public void trace(String s, Object o) {
        Logger.trace(getTrace() + s, o);
    }
    
    @Override
    public void trace(String s, Object o, Object o1) {
        Logger.trace(getTrace() + s, o, o1);
    }
    
    @Override
    public void trace(String s, Object... objects) {
        Logger.trace(getTrace() + s, objects);
    }
    
    @Override
    public void trace(String s, Throwable throwable) {
        Logger.trace(getTrace() + s, throwable);
    }
    
    @Override
    public boolean isTraceEnabled(Marker marker) {
        return Logger.isTraceEnabled(marker);
    }
    
    @Override
    public void trace(Marker marker, String s) {
        Logger.trace(marker, getTrace() + s);
    }
    
    @Override
    public void trace(Marker marker, String s, Object o) {
        Logger.trace(marker, getTrace() + s, o);
    }
    
    @Override
    public void trace(Marker marker, String s, Object o, Object o1) {
        Logger.trace(marker, getTrace() + s, o, o1);
    }
    
    @Override
    public void trace(Marker marker, String s, Object... objects) {
        Logger.trace(marker, getTrace() + s, objects);
    }
    
    @Override
    public void trace(Marker marker, String s, Throwable throwable) {
        Logger.trace(marker, getTrace() + s, throwable);
    }
    
    @Override
    public boolean isDebugEnabled() {
        return Logger.isDebugEnabled();
    }
    
    @Override
    public void debug(String s) {
        Logger.debug(getTrace() + s);
    }
    
    @Override
    public void debug(String s, Object o) {
        Logger.debug(getTrace() + s, o);
    }
    
    @Override
    public void debug(String s, Object o, Object o1) {
        Logger.debug(getTrace() + s, o ,o1);
    }
    
    @Override
    public void debug(String s, Object... objects) {
        Logger.debug(getTrace() + s, objects);
    }
    
    @Override
    public void debug(String s, Throwable throwable) {
        Logger.debug(getTrace() + s, throwable);
    }
    
    @Override
    public boolean isDebugEnabled(Marker marker) {
        return Logger.isDebugEnabled(marker);
    }
    
    @Override
    public void debug(Marker marker, String s) {
        Logger.debug(marker, getTrace() + s);
    }
    
    @Override
    public void debug(Marker marker, String s, Object o) {
        Logger.debug(marker, getTrace() + s, o);
    }
    
    @Override
    public void debug(Marker marker, String s, Object o, Object o1) {
        Logger.debug(marker, getTrace() + s, o, o1);
    }
    
    @Override
    public void debug(Marker marker, String s, Object... objects) {
        Logger.debug(marker, getTrace() + s, objects);
    }
    
    @Override
    public void debug(Marker marker, String s, Throwable throwable) {
        Logger.debug(marker, getTrace() + s, throwable);
    }
    
    @Override
    public boolean isInfoEnabled() {
        return Logger.isInfoEnabled();
    }
    
    @Override
    public void info(String s) {
        Logger.info(getTrace() + s);
    }
    
    @Override
    public void info(String s, Object o) {
        Logger.info(getTrace() + s, o);
    }
    
    @Override
    public void info(String s, Object o, Object o1) {
        Logger.info(getTrace() + s, o , o1);
    }
    
    @Override
    public void info(String s, Object... objects) {
        Logger.info(getTrace() + s, objects);
    }
    
    @Override
    public void info(String s, Throwable throwable) {
        Logger.info(getTrace() + s, throwable);
    }
    
    @Override
    public boolean isInfoEnabled(Marker marker) {
        return Logger.isInfoEnabled(marker);
    }
    
    @Override
    public void info(Marker marker, String s) {
        Logger.info(marker, getTrace() + s);
    }
    
    @Override
    public void info(Marker marker, String s, Object o) {
        Logger.info(marker, getTrace() + s, o);
    }
    
    @Override
    public void info(Marker marker, String s, Object o, Object o1) {
        Logger.info(marker, getTrace() + s, o, o1);
    }
    
    @Override
    public void info(Marker marker, String s, Object... objects) {
        Logger.info(marker, getTrace() + s, objects);
    }
    
    @Override
    public void info(Marker marker, String s, Throwable throwable) {
        Logger.info(marker, getTrace() + s, throwable);
    }
    
    @Override
    public boolean isWarnEnabled() {
        return Logger.isWarnEnabled();
    }
    
    @Override
    public void warn(String s) {
        Logger.warn(getTrace() + s);
    }
    
    @Override
    public void warn(String s, Object o) {
        Logger.warn(getTrace() + s, o);
    }
    
    @Override
    public void warn(String s, Object... objects) {
        Logger.warn(getTrace() + s, objects);
    }
    
    @Override
    public void warn(String s, Object o, Object o1) {
        Logger.warn(getTrace() + s, o, o1);
    }
    
    @Override
    public void warn(String s, Throwable throwable) {
        Logger.warn(getTrace() + s, throwable);
    }
    
    @Override
    public boolean isWarnEnabled(Marker marker) {
        return Logger.isWarnEnabled(marker);
    }
    
    @Override
    public void warn(Marker marker, String s) {
        Logger.warn(marker, getTrace() + s);
    }
    
    @Override
    public void warn(Marker marker, String s, Object o) {
        Logger.warn(marker, getTrace() + s, o);
    }
    
    @Override
    public void warn(Marker marker, String s, Object o, Object o1) {
        Logger.warn(marker, getTrace() + s, o, o1);
    }
    
    @Override
    public void warn(Marker marker, String s, Object... objects) {
        Logger.warn(marker, getTrace() + s, objects);
    }
    
    @Override
    public void warn(Marker marker, String s, Throwable throwable) {
        Logger.warn(marker, getTrace() + s, throwable);
    }
    
    @Override
    public boolean isErrorEnabled() {
        return Logger.isErrorEnabled();
    }
    
    @Override
    public void error(String s) {
        Logger.error(getTrace() + s);
    }
    
    @Override
    public void error(String s, Object o) {
        Logger.error(getTrace() + s, o);
    }
    
    @Override
    public void error(String s, Object o, Object o1) {
        Logger.error(getTrace() + s, o ,o1);
    }
    
    @Override
    public void error(String s, Object... objects) {
        Logger.error(getTrace() + s, objects);
    }
    
    @Override
    public void error(String s, Throwable throwable) {
        Logger.error(getTrace() + s, throwable);
    }
    
    @Override
    public boolean isErrorEnabled(Marker marker) {
        return Logger.isErrorEnabled(marker);
    }
    
    @Override
    public void error(Marker marker, String s) {
        Logger.error(marker, getTrace() + s);
    }
    
    @Override
    public void error(Marker marker, String s, Object o) {
        Logger.error(marker, getTrace() + s, o);
    }
    
    @Override
    public void error(Marker marker, String s, Object o, Object o1) {
        Logger.error(marker, getTrace() + s, o, o1);
    }
    
    @Override
    public void error(Marker marker, String s, Object... objects) {
        Logger.error(marker, getTrace() + s, objects);
    }
    
    @Override
    public void error(Marker marker, String s, Throwable throwable) {
        Logger.error(marker, getTrace() + s, throwable);
    }
}
