package com.will.observer;

import java.util.Observable;
import java.util.Observer;

public class Buyer implements Observer {

    private double percentLimit = 0;
    private boolean hasHouse = false;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasHouse() {
        return hasHouse;
    }

    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }

    public double getPercentLimit() {
        return percentLimit;
    }

    public void setPercentLimit(double percentLimit) {
        this.percentLimit = percentLimit;
    }

    public Buyer(String name, double per) {
        this.name = name;
        percentLimit = per;
    }

    @Override
    public void update(Observable o, Object arg) {
        House h = (House) o;
        double inc = (double) arg;
        double originPrice = h.getPrice();

        double per = inc / originPrice;
        // System.out.println(name + " org:[ " + originPrice + "] per{" + per + "]" + "hasHouse[" + hasHouse + "]");
        if (per > percentLimit && !hasHouse) {
            this.buy();
        } else if (per < 0 && hasHouse) {
            this.sell();
        } else {
            this.waitIt();
        }
    }

    private void buy() {
        System.out.println(name + " buy a house!");
        this.hasHouse = true;
    }

    private void waitIt() {
        System.out.println(name + " wait it...");
    }

    private void sell() {
        System.out.println(name + " sell a house");
        this.hasHouse = false;
    }

}

