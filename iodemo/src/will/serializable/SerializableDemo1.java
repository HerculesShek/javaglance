package will.serializable;

import will.serializable.pojo.Gender;
import will.serializable.pojo.Person;
import will.serializable.pojo.Student;

import java.io.*;

public class SerializableDemo1 {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(Gender.FEMALE, 34, "Jerry");
        Person p2 = new Person(Gender.MALE, 24, "Will");
        Student s1 = new Student(Gender.FEMALE, 17, "Emily", 95.0);
        Student s2 = new Student(Gender.FEMALE, 18, "Emily", 96.0);

        FileOutputStream fos = new FileOutputStream("objects.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.tmp"));
        p1 = (Person) ois.readObject();
        System.out.println(p1);
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        ois.close();

    }
}
