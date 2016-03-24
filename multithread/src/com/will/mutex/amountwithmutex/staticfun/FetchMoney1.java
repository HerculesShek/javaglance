package com.will.mutex.amountwithmutex.staticfun;

public class FetchMoney1 {
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account(1000);

        Thread atm = new Thread(new WithdrawThread(account1, 600)); // 从atm取600
        Thread bank = new Thread(new WithdrawThread(account2, 800)); // 从银行取800
        atm.start();
        bank.start();
    }

}
