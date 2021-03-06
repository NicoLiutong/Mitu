package com.nico.mitu.Util;

import android.util.Log;

/**
 * Log日志工具类
 */
public class LogUtil {

    private LogUtil(){}

    public static boolean isDebug = true; //通过在Application初始化

    /**
     * 打印information日志
     * @param tag 标签
     * @param msg 日志信息
     */
    public static void i(String tag,String msg){
        if(isDebug) {
            Log.i(tag, msg);
        }
    }

    /**
     * 打印information日志
     * @param tag   标签
     * @param msg   日志信息
     * @param throwable 异常
     */
    public static void i(String tag, String msg, Throwable throwable){
        if(isDebug) {
            Log.i(tag, msg, throwable);
        }
    }

    /**
     * 打印verbose日志
     * @param tag   标签
     * @param msg   日志信息
     */
    public static void v(String tag, String msg){
        if(isDebug) {
            Log.v(tag, msg);
        }
    }

    /**
     * 打印verbose日志
     * @param tag   标签
     * @param msg   日志信息
     * @param throwable 异常
     */
    public static void v(String tag, String msg, Throwable throwable){
        if(isDebug) {
            Log.v(tag, msg, throwable);
        }
    }

    /**
     * 打印debug信息
     * @param tag   标签信息
     * @param msg   日志信息
     */
    public static void d(String tag, String msg){
        if(isDebug) {
            Log.d(tag, msg);
        }
    }

    /**
     * 打印debug日志
     * @param tag   标签信息
     * @param msg   日志信息
     * @param throwable 异常
     */
    public static void d(String tag, String msg, Throwable throwable){
        if(isDebug) {
            Log.d(tag, msg, throwable);
        }
    }

    /**
     * 打印warn日志
     * @param tag   标签信息
     * @param msg   日志信息
     */
    public static void w(String tag, String msg){
        if(isDebug) {
            Log.w(tag, msg);
        }
    }

    /**
     * 打印warn日志
     * @param tag   标签信息
     * @param msg   日志信息
     * @param throwable 异常
     */
    public static void w(String tag, String msg, Throwable throwable){
        if(isDebug) {
            Log.w(tag, msg, throwable);
        }
    }

    /**
     * 打印error日志
     * @param tag   标签
     * @param msg   日志信息
     */
    public static void e(String tag, String msg){
        if(isDebug) {
            Log.e(tag, msg);
        }
    }

    /**
     * 打印error日志
     * @param tag   标签
     * @param msg   日志信息
     * @param throwable 异常
     */
    public static void e(String tag, String msg, Throwable throwable){
        if(isDebug) {
            Log.e(tag, msg, throwable);
        }
    }
}
