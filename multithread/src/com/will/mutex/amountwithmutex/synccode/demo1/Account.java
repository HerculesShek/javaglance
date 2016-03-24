package com.will.mutex.amountwithmutex.synccode.demo1;

public class Account {
    private Integer balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int withDraw(int amount) {
        synchronized (balance) {
            if (amount <= 0) return -1;
            if (amount > balance) return -2;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("after withDraw balance now is " + balance);
            return amount;
        }
    }


    public int deposit(int amount) {
        synchronized (balance) {
            if (amount <= 0) return -1;
            if (amount > (1 << 15)) return -1;
            if ((amount + balance) > (1 << 16)) return -1;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amount;
            System.out.println("after deposit balance now is " + balance);
            return amount;
        }
    }


}
