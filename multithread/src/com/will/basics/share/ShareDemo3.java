package com.will.basics.share;

public class ShareDemo3 implements Runnable {
    int i;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("the i is " + i);
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 42) break;
        }
    }

    public static void main(String[] args) {
        /** 这里只是引用传递的一个小把戏而已 */
        ShareDemo3 demo = new ShareDemo3();
        Thread t1 = new Thread(demo);
        demo = new ShareDemo3();
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();
    }
}
