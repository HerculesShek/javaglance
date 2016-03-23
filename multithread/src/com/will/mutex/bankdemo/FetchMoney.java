package com.will.mutex.bankdemo;

public class FetchMoney {
    public static void main(String[] args) {
        Account account = new Account(1000);

        Thread atm = new Thread(new WithdrawThread(account, 600)); // 从atm取600
        Thread bank = new Thread(new WithdrawThread(account, 800)); // 从银行取800
        atm.start();
        bank.start();
    }

}
