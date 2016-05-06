package com.will.singleton;


public class Singleton5 {
    private volatile static Singleton5 singleton;
    private Singleton5() {
    }

    public static synchronized Singleton5 getInstance() {
        if (singleton == null) {
            synchronized (Singleton5.class) {
                if (singleton == null) singleton = new Singleton5();
            }
        }
        return singleton;
    }
}
