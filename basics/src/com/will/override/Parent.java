package com.will.override;

/**
 * @author Will
 * @date 16/5/11
 */
public class Parent {
    protected void say() {
        System.out.println("greetings from Parent");
    }

    protected static Parent foo() {
        System.out.println("foo in Parent");
        return new Parent();
    }
}
