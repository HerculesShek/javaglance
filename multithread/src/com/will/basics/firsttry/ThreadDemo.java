package com.will.basics.firsttry;

public class ThreadDemo extends Thread {

    private String pre;

    public ThreadDemo(String pre) {
        this.pre = pre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(pre + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("hello ");
        ThreadDemo t2 = new ThreadDemo("welcome ");
        /** 交替打印 */
        t1.start();
        t2.start();
    }
}
