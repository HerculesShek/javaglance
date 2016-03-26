package com.will.pojo;

import java.io.*;

public class StudentSeria implements Serializable {
    private int age;
    private String name;
    private TeacherSeria teacher;


    public StudentSeria() {
    }

    public StudentSeria(int age, String name) {
        this.age = age;
        this.name = name;
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

    public TeacherSeria getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherSeria teacher) {
        this.teacher = teacher;
    }

    public StudentSeria deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (StudentSeria) ois.readObject();
    }

    @Override
    public String toString() {
        return "[name:" + name + ", age:" + age + ", teacher:" + teacher.getName() + "]";
    }
}
