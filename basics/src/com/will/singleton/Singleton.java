package com.will.singleton;

/**
 * @author Will
 * @date 16/5/6
 */
public class Singleton {
    private Singleton() {}
    private static Singleton singleton = null;
    public static synchronized Singleton getInstance() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }
}
