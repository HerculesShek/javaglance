package com.will.basics.pojo;


public class Person implements Comparable<Person> {

    public static int MAX = 10000;

    {
        System.out.println(this);
        System.out.println("init a instance");
        name = "Will";
        age = 23;
        System.out.println(this);
    }

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        System.out.println("constructor with name and age");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }


    public static void main(String[] args) {
        System.out.println(new Person("Jack", 23));
        System.out.println("----------------------------------------------------");
        System.out.println(new Person());
    }
}
