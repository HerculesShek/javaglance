package com.will.classdemo;

/**
 * @author Will
 * @date 16/5/6
 */
public class Singleton3 {
    private Singleton3() {}
    private static Singleton3 singleton = null;
    static {
        singleton = new Singleton3();
    }
    public static synchronized Singleton3 getInstance() {
        return singleton;
    }
}
