package com.will.share;

public class ShareDemo1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("i is " + i);

            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 42) break;
        }
    }

    public static void main(String[] args) {
        ShareDemo1 demo = new ShareDemo1();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();
    }
}
