package com.test.classdemo;

import com.will.singleton.EnumSingleton;
import com.will.singleton.Singleton;

/**
 * @author Will
 * @date 16/5/6
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton1));

        EnumSingleton s1 = EnumSingleton.INSTANCE;

    }
}
