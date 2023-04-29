package com.gather.proxy;

import org.slf4j.Logger;
import org.slf4j.Marker;

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
        Logger.trace(s);
    }
    
    @Override
    public void trace(String s, Object o) {
        Logger.trace(s, o);
    }
    
    @Override
    public void trace(String s, Object o, Object o1) {
        Logger.trace(s, o, o1);
    }
    
    @Override
    public void trace(String s, Object... objects) {
        Logger.trace(s, objects);
    }
    
    @Override
    public void trace(String s, Throwable throwable) {
        Logger.trace(s, throwable);
    }
    
    @Override
    public boolean isTraceEnabled(Marker marker) {
        return Logger.isTraceEnabled(marker);
    }
    
    @Override
    public void trace(Marker marker, String s) {
        Logger.trace(marker, s);
    }
    
    @Override
    public void trace(Marker marker, String s, Object o) {
        Logger.trace(marker, s, o);
    }
    
    @Override
    public void trace(Marker marker, String s, Object o, Object o1) {
        Logger.trace(marker, s, o, o1);
    }
    
    @Override
    public void trace(Marker marker, String s, Object... objects) {
        Logger.trace(marker, s, objects);
    }
    
    @Override
    public void trace(Marker marker, String s, Throwable throwable) {
        Logger.trace(marker, s, throwable);
    }
    
    @Override
    public boolean isDebugEnabled() {
        return Logger.isDebugEnabled();
    }
    
    @Override
    public void debug(String s) {
        Logger.debug(s);
    }
    
    @Override
    public void debug(String s, Object o) {
        Logger.debug(s, o);
    }
    
    @Override
    public void debug(String s, Object o, Object o1) {
        Logger.debug(s, o ,o1);
    }
    
    @Override
    public void debug(String s, Object... objects) {
        Logger.debug(s, objects);
    }
    
    @Override
    public void debug(String s, Throwable throwable) {
        Logger.debug(s, throwable);
    }
    
    @Override
    public boolean isDebugEnabled(Marker marker) {
        return Logger.isDebugEnabled(marker);
    }
    
    @Override
    public void debug(Marker marker, String s) {
        Logger.debug(marker, s);
    }
    
    @Override
    public void debug(Marker marker, String s, Object o) {
        Logger.debug(marker, s, o);
    }
    
    @Override
    public void debug(Marker marker, String s, Object o, Object o1) {
        Logger.debug(marker, s, o, o1);
    }
    
    @Override
    public void debug(Marker marker, String s, Object... objects) {
        Logger.debug(marker, s, objects);
    }
    
    @Override
    public void debug(Marker marker, String s, Throwable throwable) {
        Logger.debug(marker, s, throwable);
    }
    
    @Override
    public boolean isInfoEnabled() {
        return Logger.isInfoEnabled();
    }
    
    @Override
    public void info(String s) {
        Logger.info(s);
    }
    
    @Override
    public void info(String s, Object o) {
        Logger.info(s, o);
    }
    
    @Override
    public void info(String s, Object o, Object o1) {
        Logger.info(s, o , o1);
    }
    
    @Override
    public void info(String s, Object... objects) {
        Logger.info(s, objects);
    }
    
    @Override
    public void info(String s, Throwable throwable) {
        Logger.info(s, throwable);
    }
    
    @Override
    public boolean isInfoEnabled(Marker marker) {
        return Logger.isInfoEnabled(marker);
    }
    
    @Override
    public void info(Marker marker, String s) {
        Logger.info(marker, s);
    }
    
    @Override
    public void info(Marker marker, String s, Object o) {
        Logger.info(marker, s, o);
    }
    
    @Override
    public void info(Marker marker, String s, Object o, Object o1) {
        Logger.info(marker, s, o, o1);
    }
    
    @Override
    public void info(Marker marker, String s, Object... objects) {
        Logger.info(marker, s, objects);
    }
    
    @Override
    public void info(Marker marker, String s, Throwable throwable) {
        Logger.info(marker, s, throwable);
    }
    
    @Override
    public boolean isWarnEnabled() {
        return Logger.isWarnEnabled();
    }
    
    @Override
    public void warn(String s) {
        Logger.warn(s);
    }
    
    @Override
    public void warn(String s, Object o) {
        Logger.warn(s, o);
    }
    
    @Override
    public void warn(String s, Object... objects) {
        Logger.warn(s, objects);
    }
    
    @Override
    public void warn(String s, Object o, Object o1) {
        Logger.warn(s, o, o1);
    }
    
    @Override
    public void warn(String s, Throwable throwable) {
        Logger.warn(s, throwable);
    }
    
    @Override
    public boolean isWarnEnabled(Marker marker) {
        return Logger.isWarnEnabled(marker);
    }
    
    @Override
    public void warn(Marker marker, String s) {
        Logger.warn(marker, s);
    }
    
    @Override
    public void warn(Marker marker, String s, Object o) {
        Logger.warn(marker, s, o);
    }
    
    @Override
    public void warn(Marker marker, String s, Object o, Object o1) {
        Logger.warn(marker, s, o, o1);
    }
    
    @Override
    public void warn(Marker marker, String s, Object... objects) {
        Logger.warn(marker, s, objects);
    }
    
    @Override
    public void warn(Marker marker, String s, Throwable throwable) {
        Logger.warn(marker, s, throwable);
    }
    
    @Override
    public boolean isErrorEnabled() {
        return Logger.isErrorEnabled();
    }
    
    @Override
    public void error(String s) {
        Logger.error(s);
    }
    
    @Override
    public void error(String s, Object o) {
        Logger.error(s, o);
    }
    
    @Override
    public void error(String s, Object o, Object o1) {
        Logger.error(s, o ,o1);
    }
    
    @Override
    public void error(String s, Object... objects) {
        Logger.error(s, objects);
    }
    
    @Override
    public void error(String s, Throwable throwable) {
        Logger.error(s, throwable);
    }
    
    @Override
    public boolean isErrorEnabled(Marker marker) {
        return Logger.isErrorEnabled(marker);
    }
    
    @Override
    public void error(Marker marker, String s) {
        Logger.error(marker, s);
    }
    
    @Override
    public void error(Marker marker, String s, Object o) {
        Logger.error(marker, s, o);
    }
    
    @Override
    public void error(Marker marker, String s, Object o, Object o1) {
        Logger.error(marker, s, o, o1);
    }
    
    @Override
    public void error(Marker marker, String s, Object... objects) {
        Logger.error(marker, s, objects);
    }
    
    @Override
    public void error(Marker marker, String s, Throwable throwable) {
        Logger.error(marker, s, throwable);
    }
}
