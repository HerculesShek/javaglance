package com.will.basics.mutex.amountwithmutex.synccode.demo1;

/**
 * @author Will
 * @date 16/3/24
 */
public class WithdrawThread implements Runnable {
    private Account account;
    private double amount;

    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("取出了 " + account.withDraw(amount));
        ;
    }
}
