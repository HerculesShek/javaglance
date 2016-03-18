package will.write;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteArrayOutputDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String str = "I have a dream" + System.getProperty("line.separator");
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);

        byte[] res = outputStream.toByteArray();
        for (byte b : res) {
            System.out.print((char) b);
        }

        OutputStream fileOut = new FileOutputStream("xz_flag.txt", true);
        outputStream.writeTo(fileOut);
        fileOut.close();
        outputStream.close();
    }


}
