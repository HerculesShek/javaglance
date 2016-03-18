package will.write;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String str = "I have a dream";
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);

        byte[] res = outputStream.toByteArray();
        for (byte b : res) {
            System.out.print((char)b);
        }
    }


}
