package com.will.waitnotify.sample;

public class Sample {
    private int num;
    private static final int LIMIT = 5;

    public synchronized void increase() {
        while (num != 0) { /** 这个地方一定不能用if */
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("num is " + num);
        notify();
    }

    public synchronized void decrease() {
        while (num == 0) { /** 这个地方一定不能用if */
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("num is " + num);
        notify();
    }
}
