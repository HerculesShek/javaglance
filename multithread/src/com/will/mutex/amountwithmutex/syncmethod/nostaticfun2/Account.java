package com.will.mutex.amountwithmutex.syncmethod.nostaticfun2;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    /**
     * 存款
     *
     * @param amount
     * @return
     */
    public synchronized int withdraw(int amount) {
        if (amount <= 0) return -1;
        if (balance <= 0) return -1;
        if (amount > balance) return -2;
        try {
            Thread.sleep((long) (3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= amount;
        System.out.println("after withdraw balance now is " + balance);
        return amount;
    }

    /**
     * 取款
     *
     * @param amount
     * @return
     */
    public synchronized int deposit(int amount) {
        if (amount <= 0) return -1;
        if (amount > (1 << 16)) return -1;
        if ((amount + balance) > (1 << 16)) return -1;
        try {
            Thread.sleep((long) (Math.random() * 500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += amount;
        System.out.println("after deposit balance now is " + balance);
        return amount;
    }


}
