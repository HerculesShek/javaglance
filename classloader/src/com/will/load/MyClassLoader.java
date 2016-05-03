package com.will.load;

import sun.tools.tree.NewArrayExpression;

import java.io.*;

public class MyClassLoader extends ClassLoader {
    private String name;
    private String path = "/Users/baidu/java/myCLasses";
    private final String fileType = ".class";

    public MyClassLoader(String name) {
        super();
        this.name = name;
    }

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "MyClassLoader{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            this.name = name.replace(".", File.separator);
            is = new FileInputStream(new File(path + name + fileType));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception ignored) {
            ;
        } finally {
            try {
                assert is != null;
                is.close();
                assert baos != null;
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        // System.out.println(File.separator);
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("/Users/baidu/java/myCLasses/serverlib");

        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setPath("/Users/baidu/java/myCLasses/clientlib");

        MyClassLoader loader3 = new MyClassLoader(null, "loader2");
        loader2.setPath("/Users/baidu/java/myCLasses/loader3lib");

        test(loader1);
    }

    public static void test(ClassLoader loader) throws Exception {
        Class c = loader.loadClass("com.will.loader.Sample");
        Object obj = c.newInstance();
    }

}
