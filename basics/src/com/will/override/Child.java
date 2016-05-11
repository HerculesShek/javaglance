package com.will.override;

/**
 * @author Will
 * @date 16/5/11
 */
public class Child extends Parent {
    @Override
    public void say() {
        System.out.println("greetings from Child");
    }

    protected static Child foo() {
        System.out.println("foo in Child");
        return new Child();
    }

    public final static void bar() {
        System.out.println("bar from Parent");
    }
}
