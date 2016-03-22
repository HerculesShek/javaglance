package will.serializable.pojo;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("no-arg constructor Person");
    }

    public Person(Gender gender, int age, String name) {
        System.out.println("all arg constructor Person");
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[" + name + ", " + age + ", " + gender + "]";
    }
}
