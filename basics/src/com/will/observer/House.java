package com.will.observer;

import java.util.Observable;

public class House extends Observable {
    private double price = 0;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public House(double price) {
        this.price = price;
    }

    public void increasePrice(double inc) {
        this.price += inc;
        this.setChanged();
        this.notifyObservers(inc);
    }
}
