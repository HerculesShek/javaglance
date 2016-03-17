package will.classic.tree;

import java.io.File;

/**
 * 完美实现linux的tree的功能 展示效果一模一样 Bingo!
 */
public class TreeCmd2 {
    public static void tree(String dir, int depth, boolean showHidden) {
        System.out.println(dir + "/");
        tree(dir, depth, "|\t", "|-- ", "`-- ", "\t", new String[]{}, showHidden);
    }

    /**
     * linux tree command
     *
     * @param dir        dir name
     * @param depth      depth
     * @param prefix1    "|\t"
     * @param prefix2    "|-- "
     * @param prefix3    "`-- "
     * @param prefix4    "\t"
     * @param showHidden -a
     */
    public static void tree(String dir, int depth, String prefix1, String prefix2, String prefix3, String prefix4,
                            String prefixArr[], boolean showHidden) {
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
            StringBuilder builder = contactBuffer(prefixArr);
            // 该目录下最后一个文件
            boolean isLastFile = (i == files.length - 1);
            if (isLastFile)
                builder.append(prefix3);
            else
                builder.append(prefix2);
            System.out.println(builder.toString() + filename);

            if (f.isDirectory() && depth > 0) {
                String[] newStrArr = arrCopyAndAppend(prefixArr, isLastFile, prefix1, prefix4);
                tree(f.getAbsoluteFile().getParent() + File.separator + f.getName(), depth - 1, prefix1, prefix2, prefix3, prefix4, newStrArr, showHidden);
            }
        }
    }

    private static StringBuilder contactBuffer(String[] strArr) {
        StringBuilder buffer = new StringBuilder();
        for (String str : strArr) {
            buffer.append(str);
        }
        return buffer;
    }

    private static String[] arrCopyAndAppend(String[] strArr, boolean isLast, String prefix1, String prefix4) {
        final int oldLen = strArr.length;
        final String[] newStrArr = new String[oldLen + 1];
        System.arraycopy(strArr, 0, newStrArr, 0, oldLen);
        if (isLast)
            newStrArr[oldLen] = prefix4;
        else
            newStrArr[oldLen] = prefix1;
        return newStrArr;
    }

    public static void main(String[] args) {
        File file = new File("/Users/baidu/IdeaProjects/javaglance/innerclass");
        tree(file.getAbsoluteFile().getParent(), 5, false);
    }
}
