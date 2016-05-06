package com.will.singleton;


public class Singleton5 {
    private Singleton5() {}

    private static class SingletonHolder {
        private static final Singleton5 singleton = new Singleton5();
    }

    public static synchronized Singleton5 getInstance() {
        return SingletonHolder.singleton;
    }
}
