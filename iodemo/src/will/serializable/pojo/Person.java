package will.serializable.pojo;


import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;
    private Gender gender;

    public Person() {
        System.out.println("no-arg constructor");
    }

    public Person(Gender gender, int age, String name) {
        System.out.println("all arg constructor");
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    

    @Override
    public String toString() {
        return "Person[" + name + ", " + age + ", " + gender + "]";
    }
}
