package com.will.observer;

public class SellHouse {
    public static void main(String[] args) {
        House h = new House(100);
        Buyer b1 = new Buyer("Will", .1);
        Buyer b2 = new Buyer("Jack", .2);
        Buyer b3 = new Buyer("Tom", .3);

        h.addObserver(b1);
        h.addObserver(b2);
        h.addObserver(b3);

        h.increasePrice(5);
        h.increasePrice(16);
        h.increasePrice(-30);
        h.increasePrice(50);
    }
}
