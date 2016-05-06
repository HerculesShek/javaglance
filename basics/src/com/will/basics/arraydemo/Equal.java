package com.will.basics.arraydemo;

import java.util.Arrays;

public class Equal {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = a;
        int c[] = {1, 2, 3};

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // false

        System.out.println(Arrays.equals(a, c));


        int intarr1[][] = {
                {1, 2, 3},
                {4, 5}
        };

        int intarr2[][] = {
                {1, 2, 3},
                {4, 5}
        };
        System.out.println(Arrays.equals(intarr2, intarr1));


        int arr1[][][] = {
                {
                        {1, 2, 3},
                        {32},
                        {3, 4,}
                },
                {
                        {3, 4, 5, 6, 7},
                        {433, 760}
                }
        };

        int arr2[][][] = {
                {
                        {1, 2, 3},
                        {32},
                        {3, 4,}
                },
                {
                        {3, 4, 5, 6, 7},
                        {433, 760}
                }
        };

        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));


    }
}
