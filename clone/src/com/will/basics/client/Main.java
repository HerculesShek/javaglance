package com.will.basics.client;

import com.will.basics.pojo.Student;
import com.will.basics.pojo.Teacher;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher("TNT");

        Student s1 = new Student(24, "Jack");
        s1.setTeacher(teacher);
        Student s2 = (Student) s1.clone();
        System.out.println(s1 == s2);
        System.out.println(s2);

        System.out.println("----------------------------");
        s2.setName("Tom");
        System.out.println(s1);

        System.out.println("-----------------------------");
        s2.getTeacher().setName("CO");
        System.out.println(s1.getTeacher().getName());
    }
}
