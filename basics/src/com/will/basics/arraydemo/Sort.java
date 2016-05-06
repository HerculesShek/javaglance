package com.will.basics.arraydemo;

import com.will.basics.pojo.Person;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        test0();
        test1();
    }


    public static void test0() {
        int a[] = new int[]{4, 6, 23, 78, 22, 54, 8};
        Arrays.sort(a);
        for (int i : a)
            System.out.println(i);
    }

    public static void test1() {
        Person ps[] = {
                new Person("jack", 24),
                new Person("will", 22),
                new Person("tom", 5),
                new Person("uri", 50),
        };
        Arrays.sort(ps);
        for (Person i : ps)
            System.out.println(i);

    }
}
