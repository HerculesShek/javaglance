package com.will.basics.waitnotify.consumerproductor;

public class Producter implements Runnable {
    private Godown godown;

    public Producter(Godown godown) {
        this.godown = godown;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = (int) (Math.random() * 100 % 40);
            godown.produce(num);
        }
    }
}
