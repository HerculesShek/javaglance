package com.will.basics.continuedemo;

public class Demo {
    public static void main(String[] args) {
        continueTest0();
    }

    static void continueTest0() {
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
                foundIt = true;
                break test;
            }
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");

    }
}
