package com.will.basics.mutex.amountwithnomutex;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int withdraw(int amount) {
        if (amount <= 0) return -1;
        if (balance <= 0) return -1;
        if (amount > balance) return -2;
        try {
            Thread.sleep((long) (Math.random() * 500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= amount;
        System.out.println("balance now is " + balance);
        return amount;
    }

}
