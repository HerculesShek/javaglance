package com.will.waitnotify.consumerproductor;

public class Main {
    public static void main(String[] args) {
        Godown godown = new Godown(0);

        Thread p1 = new Thread(new Producter(godown));
        Thread p2 = new Thread(new Producter(godown));
        Thread p3 = new Thread(new Producter(godown));

        Thread c1 = new Thread(new Consumer(godown));
        Thread c2 = new Thread(new Consumer(godown));
        Thread c3 = new Thread(new Consumer(godown));
        Thread c4 = new Thread(new Consumer(godown));

        p1.start();
        p2.start();
        p3.start();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
