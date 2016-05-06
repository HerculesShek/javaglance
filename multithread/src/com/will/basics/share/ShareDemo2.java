package com.will.basics.share;

public class ShareDemo2 implements Runnable {
    int i;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("num is " + i);
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 42) break;
        }
    }

    public static void main(String[] args) {
        ShareDemo2 demo = new ShareDemo2();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();
    }
}
