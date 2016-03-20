package will.read;

import java.io.*;

public class ReaderWriterTest {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("data.txt", true));
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write("www.google.com" + System.getProperty("line.separator"));
        wr.write("你好 Will!" + System.getProperty("line.separator"));
        wr.close();


        InputStreamReader reader = new InputStreamReader(new FileInputStream("data.txt"));
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
