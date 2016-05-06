package com.will.classdemo;

/**
 * @author Will
 * @date 16/5/6
 */
public class Singleton2 {
    private Singleton2() {}
    private static Singleton2 singleton = new Singleton2();
    public static synchronized Singleton2 getInstance() {
        return singleton;
    }
}
