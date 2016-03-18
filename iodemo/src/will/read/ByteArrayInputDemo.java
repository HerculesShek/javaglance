package will.read;

import java.io.ByteArrayInputStream;

public class ByteArrayInputDemo {
    public static void main(String[] args) throws Exception {
        byte[] bytes = "I have a dream".getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(bytes, 2, 4);

        int c;
        while ((c=inputStream.read()) != -1) {
            char ch = (char)c;
            System.out.println(ch);
        }
        System.out.println("------------------");
        while ((c=inputStream2.read()) != -1) {
            char ch = (char)c;
            System.out.println(ch);
        }
    }


}
