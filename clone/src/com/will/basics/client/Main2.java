package com.will.basics.client;

import com.will.basics.pojo.StudentSeria;
import com.will.basics.pojo.TeacherSeria;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TeacherSeria teacher = new TeacherSeria("TNT", 30);

        StudentSeria s1 = new StudentSeria(24, "Jack");
        s1.setTeacher(teacher);

        StudentSeria s2 = s1.deepCopy();
        System.out.println(s1 == s2);
        System.out.println(s2);

        System.out.println("----------------------------");
        s2.setName("Tom");
        System.out.println(s1);

        System.out.println("-----------------------------");
        s2.getTeacher().setName("CO");
        System.out.println(s1.getTeacher().getName());

        teacher.setName("K2SO4");
        System.out.println(s2.getTeacher().getName());
    }
}
