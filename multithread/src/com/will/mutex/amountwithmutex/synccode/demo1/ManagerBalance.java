package com.will.mutex.amountwithmutex.synccode.demo1;

/**
 * @author Will
 * @date 16/3/24
 */
public class ManagerBalance {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Thread atm = new Thread(new WithdrawThread(account, 600));
        Thread atm2 = new Thread(new WithdrawThread(account, 400));
        Thread atm3 = new Thread(new WithdrawThread(account, 400));
        Thread atm4 = new Thread(new WithdrawThread(account, 400));
        Thread bank = new Thread(new DepositThread(account, 100));
        
        atm.start();
        atm2.start();
        atm3.start();
        atm4.start();
        bank.start();

    }
}
