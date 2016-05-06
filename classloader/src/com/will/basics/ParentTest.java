package com.will.basics;

class Parent {
    static int a = 3;
    static {
        System.out.println("Parent static block");
    }
}

class Child extends Parent {
    static int b = 5;
    static {
        System.out.println("child static block");
    }
}

public class ParentTest {
    public static void main(String[] args) {
        System.out.println(Child.a);
    }
}
