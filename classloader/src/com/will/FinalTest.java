package com.will;


import java.util.Random;

class Foo {
    // public static final int x = 6 / 3;
    public static final int x = new Random().nextInt(100);

    static {
        System.out.println("static block");
    }
}

public class FinalTest {
    public static void main(String[] args) {
        System.out.println(Foo.x);
    }
}
