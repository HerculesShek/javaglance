package com.will.basics.mutex.amountwithmutex.synccode.demo1;

public class Account {
    private AccountInfo accountInfo;

    public Account(AccountInfo info) {
        this.accountInfo = info;
    }

    public double withDraw(double amount) {
        synchronized (accountInfo) {
            if (amount <= 0.0) return -1;
            if (amount > accountInfo.getBalance()) return -2;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double newBalance = accountInfo.getBalance() - amount;
            System.out.println("after withDraw balance now is " + newBalance);
            accountInfo.setBalance(newBalance);
            return amount;
        }
    }


    public double deposit(double amount) {
        synchronized (accountInfo) {
            if (amount <= 0) return -1;
            if (amount > (1 << 15)) return -1;
            if ((amount + accountInfo.getBalance()) > (1 << 16)) return -1;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double newBalance = accountInfo.getBalance() + amount;
            System.out.println("after deposit balance now is " + newBalance);
            accountInfo.setBalance(newBalance);
            return amount;
        }

    }


}
