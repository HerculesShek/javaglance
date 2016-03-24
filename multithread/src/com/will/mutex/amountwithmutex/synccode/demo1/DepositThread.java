package com.will.mutex.amountwithmutex.synccode.demo1;

/**
 * @author Will
 * @date 16/3/24
 */
public class DepositThread implements Runnable {
    private Account account;
    private int amount;

    public DepositThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("存入了 " + account.deposit(amount));
        ;
    }
}
