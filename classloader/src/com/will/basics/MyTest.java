package com.will.basics;

class Singleton {
    private static Singleton singleton = new Singleton();

    public static int counter1;
    public static int counter2 = 0;

    // private static Singleton singleton = new Singleton();

    private Singleton() {
        counter1++;
        counter2++;
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}

public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Singleton s1 = Singleton.getSingleton();
        System.out.println("C1 = " + s1.counter1);
        System.out.println("C2 = " + s1.counter2);

        ClassLoader loader = s1.getClass().getClassLoader();
        System.out.println(loader);

        loader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(loader);
    }
}
