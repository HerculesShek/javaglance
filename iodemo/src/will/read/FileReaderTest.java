package will.read;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("iodemo/src/will/read/StandStreamTest.java");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
