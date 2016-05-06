package com.will.basics.arraydemo;

import com.will.basics.pojo.Person;

public class Copy {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[5];

        System.arraycopy(a, 2, b, 2, 3);
        for (int i : b) {
            System.out.println(i);
        }

        Person ps[] = {
                new Person("jack", 23),
                new Person("will", 23),
        };

        Person pb[] = new Person[4];
        System.arraycopy(ps, 0, pb, 2, 2);

        for (Person p : pb) {
            System.out.println(p);
        }

        System.out.println(pb[2].equals(ps[0])); // true
        System.out.println(pb[2] == ps[0]); // true
    }
}
