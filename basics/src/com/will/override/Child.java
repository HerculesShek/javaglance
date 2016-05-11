package com.will.override;

/**
 * @author Will
 * @date 16/5/11
 */
public class Child extends Parent {
    @Override
    public void say() {
        super.say();
        System.out.println("greetings from Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.say();
    }
}
