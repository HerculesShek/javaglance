package com.will.client;

import com.will.pojo.Student;

/**
 * @author Will
 * @date 16/3/26
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(24, "Jack");
        Student s2 = (Student) s1.clone();
        System.out.println(s1 == s2);
        System.out.println(s2);

        System.out.println("----------------------------");
        s2.setName("Tom");
        System.out.println(s1);

    }
}
