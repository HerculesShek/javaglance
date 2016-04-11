package com.will;

class FooA {
    static {
        System.out.println("FooA static block");
    }
}

public class LoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> c = loader.loadClass("com.will.FooA");
        System.out.println(new FooA());
        System.out.println("-----------------");
        c = Class.forName("com.will.FooA");
    }
}
