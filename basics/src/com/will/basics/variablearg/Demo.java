package com.will.basics.variablearg;

/**
 * @author Will
 * @date 16/5/13
 */
public class Demo {
    public static void main(String[] args) {
        printString("Will", "Jack", "Tom");
        printString("will", "a");
        printString("will");
    }

    public static void printString(String... args) {
        for (String s : args) System.out.print(s + "..");
        System.out.println();
    }

    public static void printString(String a, String b) {
        System.out.println(a + "," + b);
    }

//    public static void printString(String test) {
//        System.out.println("----------");
//    }
}
