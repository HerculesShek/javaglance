package com.will.basics.breakdemo;

public class Demo {
    public static void main(String[] args) {
        testBreak0();
    }

    public static void testBreak0() {
        int[][] arrayOfInts = {
                {32, 87, 3, 589, 42, 1, 10},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        // int searchfor = 12;
        int searchfor = 128;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at [" + i + ", " + j + "]");
        } else {
            System.out.println(searchfor + " not in the array");
        }

    }
}
