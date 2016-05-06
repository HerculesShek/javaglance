package com.will.singleton;

/**
 * @author Will
 * @date 16/5/6
 */
public class Singleton4 {
    private Singleton4() {}

    private static class SingletonHolder {
        private static final Singleton4 singleton = new Singleton4();
    }

    public static synchronized Singleton4 getInstance() {
        return SingletonHolder.singleton;
    }
}
