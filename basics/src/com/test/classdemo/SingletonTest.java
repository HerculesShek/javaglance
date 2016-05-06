package com.test.classdemo;

import com.will.classdemo.Singleton;

/**
 * @author Will
 * @date 16/5/6
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton1));
    }
}
