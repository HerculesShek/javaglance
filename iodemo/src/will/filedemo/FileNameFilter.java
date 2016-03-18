package will.filedemo;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter {
    public static void main(String[] args) {
        File file = new File("/Users/baidu/IdeaProjects/javaglance/innerclass/src/will/localinner");
        String[] names = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(dir.getAbsolutePath());
                System.out.println(name);
                return name.endsWith(".java");
            }
        });
        for (String name : names)
            System.out.println(name);

    }
}
