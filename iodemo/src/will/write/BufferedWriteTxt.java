package will.write;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedWriteTxt {
    public static void main(String[] args) throws Exception {
        File file = new File("xz_flag.txt");
        FileOutputStream output = new FileOutputStream(file, true);
        BufferedOutputStream out = new BufferedOutputStream(output);
        String str = "I have a dream" + System.getProperty("line.separator");
        byte[] bytes = str.getBytes();
        out.write(bytes);
        out.close();
    }


}
