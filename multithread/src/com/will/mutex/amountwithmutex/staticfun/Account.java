package com.will.mutex.amountwithmutex.staticfun;

public class Account {

    private static int balance;

    public Account(int balance) {
        Account.balance = balance;
    }

    public static synchronized int withdraw(int amount) {
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
