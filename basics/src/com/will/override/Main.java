package com.will.override;

/**
 * @author Will
 * @date 16/5/11
 */
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = c;
        p.say();
        p.foo();
    }
}
