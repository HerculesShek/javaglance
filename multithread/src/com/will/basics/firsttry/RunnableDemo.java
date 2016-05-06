package com.will.basics.firsttry;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableDemo());
        Thread t2 = new Thread(new RunnableDemo());
        /** 也是交替打印 */
        t1.start();
        t2.start();

    }
}
