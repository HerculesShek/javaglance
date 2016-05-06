package com.will.basics.stringdemo;

public class Demo {
    public static void main(String[] args) {
        String str1 = "find substring here";
        String sub = "sub";
        int res = str1.indexOf(sub);
        System.out.println(res);
        System.out.println(str1.indexOf("ddd"));
    }
}
