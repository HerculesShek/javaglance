package com.will.basics.arraydemo;

/**
 * 深入探究数组的原理
 */
public class ClassName {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = {1, 2, 3};

        String as1[] = new String[10];
        String as2[] = {"will", "jack"};

        String as3[][] = new String[10][10];

        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(a.getClass().equals(b.getClass()));

        System.out.println(as1.getClass().getName());
        System.out.println(as2.getClass().getName());
        System.out.println(as1.getClass().equals(as2.getClass()));

        System.out.println(as3.getClass().getName());
    }
}
