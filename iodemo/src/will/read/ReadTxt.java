package will.read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadTxt {
    public static void main(String[] args) throws Exception {
        InputStream input = new FileInputStream("xz_flag.txt");
        byte buffer[] = new byte[256];
        int length = 0;
        while (-1 != (length = input.read(buffer))) {
            String str = new String(buffer, 0, length);
            System.out.println(str);
        }
        input.close();
    }


}
