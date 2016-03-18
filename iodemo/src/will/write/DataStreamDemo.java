package will.write;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("data.txt")));
        outputStream.writeBoolean(false);
        outputStream.writeBoolean(true);
        outputStream.writeChars("Tom");
        outputStream.close();

        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(
                new FileInputStream("data.txt")));
        // 读写的顺序要严格保持一致!
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readChar());
        System.out.println(inputStream.readChar());
        System.out.println(inputStream.readChar());
        inputStream.close();
    }
}
