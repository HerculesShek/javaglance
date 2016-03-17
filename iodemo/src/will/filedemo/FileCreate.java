package will.filedemo;

import java.io.File;
import java.io.IOException;

public class FileCreate {


    public static void main(String[] args) {
        File file = new File("/Users/baidu/IdeaProjects/javaglance/innerclass");
        boolean c = false;
        try {
            c = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(c);

    }
}
