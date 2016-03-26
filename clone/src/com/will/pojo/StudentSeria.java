package com.will.pojo;

public class StudentSeria implements Cloneable {
    private int age;
    private String name;
    private Teacher teacher;


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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StudentSeria student = (StudentSeria) super.clone();
        student.setTeacher((Teacher) teacher.clone());
        return student;
    }

    @Override
    public String toString() {
        return "[name:" + name + ", age:" + age + ", teacher:" + teacher.getName() + "]";
    }
}
