package com.will.pojo;

import java.io.Serializable;

public class TeacherSeria implements Serializable {
    private String name;
    private int age;

    public TeacherSeria(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
