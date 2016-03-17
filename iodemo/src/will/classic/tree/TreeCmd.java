package will.classic.tree;

import java.io.File;
import java.io.IOException;

public class TreeCmd {
    public static void tree(String dir, int depth, boolean showHidden) {
        System.out.println(dir + "/");
        tree(dir, depth, "|\t", "|-- ", "`-- ", 1, showHidden);
    }

    /**
     * linux tree command
     *
     * @param dir        dir name
     * @param depth      depth
     * @param prefix1    "|\t"
     * @param prefix2    "|-- "
     * @param prefix3    "`-- "
     * @param prefixNum  prefix num
     * @param showHidden -a
     */
    public static void tree(String dir, int depth, String prefix1, String prefix2, String prefix3, int prefixNum, boolean showHidden) {
        if (dir == null) return;
        if ("".equalsIgnoreCase(dir)) return;
        File root = new File(dir);
        if (!root.exists()) return;
        if (!root.isDirectory()) return;

        File files[] = root.listFiles();
        if (files == null) return;
        if (files.length == 0) return;

        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            String filename = f.getName();
            if (!showHidden && f.isHidden()) continue;
            StringBuilder prefixBuffer = new StringBuilder();
            for (int j = 0; j < prefixNum - 1; j++) {
                prefixBuffer.append(prefix1);
            }
            if (i == files.length - 1)
                prefixBuffer.append(prefix3);
            else
                prefixBuffer.append(prefix2);
            System.out.println(prefixBuffer.toString() + filename);
            if (f.isDirectory() && depth > 0) {
                tree(f.getAbsoluteFile().getParent() + File.separator + f.getName(), depth - 1, prefix1, prefix2, prefix3, prefixNum + 1, showHidden);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("/Users/baidu/IdeaProjects/javaglance/innerclass");
        tree(file.getAbsoluteFile().getParent(), 5, false);
    }
}
