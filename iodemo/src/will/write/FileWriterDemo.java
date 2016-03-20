package will.write;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Will
 * @date 16/3/20
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String str = "hello world 你好 Will!" + System.getProperty("line.separator");
        char[] chars = new char[str.length()];
        str.getChars(0, str.length(), chars, 0);
        System.out.println(chars);

        FileWriter w = new FileWriter("data.txt", true);
        for (int i = 0; i < chars.length; i++)
            w.write(chars[i]);
        w.close();
    }
}
