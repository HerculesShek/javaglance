package com.will.basics.waitnotify.consumerproductor;

public class Consumer implements Runnable {
    private Godown godown;

    public Consumer(Godown godown) {
        this.godown = godown;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = (int) (Math.random() * 100 % 50);
            godown.consume(num);
        }
    }
}
