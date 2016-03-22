package will.serializable;

import will.serializable.pojo.Gender;
import will.serializable.pojo.Person;

import java.io.*;

public class SerializableDemo1 {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(Gender.FEMALE, 34, "Jerry");
        Person p2 = new Person(Gender.MALE, 24, "Will");
        Person p3 = new Person(Gender.FEMALE, 22, "Emily");

        FileOutputStream fos = new FileOutputStream("objects.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.tmp"));
        p1 = (Person) ois.readObject();
        System.out.println(p1);
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        ois.close();

    }
}
