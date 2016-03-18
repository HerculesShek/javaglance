package will.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteTxt {
    public static void main(String[] args) throws Exception {
        File file = new File("xz_flag.txt");
        OutputStream output = new FileOutputStream(file, true);
        String str = "I have a dream" + System.getProperty("line.separator");
        byte[] bytes = str.getBytes();
        output.write(bytes);
        output.close();
    }


}
