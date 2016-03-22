package will.serializable.pojo;


import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Student extends Person implements Serializable {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
        System.out.println("no-arg constructor Student");
    }

    public Student(Gender gender, int age, String name, double score) {
        System.out.println("all arg constructor Student");
        setGender(gender);
        setAge(age);
        setName(name);
        this.score = score;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        System.out.println("write Student...");
        out.writeInt(getAge());
        out.writeUTF(getName());
        out.writeObject(getGender());
        out.writeDouble(score);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("read student...");
        setAge(in.readInt());
        setName(in.readUTF());
        setGender((Gender) in.readObject());
        score = in.readDouble();
    }

    private void readObjectNoData() throws ObjectStreamException {
        System.out.println("readObjectNoData...");
    }

    @Override
    public String toString() {
        return "Student[" + getName() + ", " + getName() + ", " + getGender() + ", " + score + "]";
    }
}
