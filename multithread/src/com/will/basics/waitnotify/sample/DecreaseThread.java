package com.will.basics.waitnotify.sample;

public class DecreaseThread implements Runnable {
    private Sample sample;

    public DecreaseThread(Sample sample) {
        this.sample = sample;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.sample.decrease();
        }
    }
}
