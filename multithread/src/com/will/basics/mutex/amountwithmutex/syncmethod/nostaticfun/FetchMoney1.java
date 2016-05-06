package com.will.basics.mutex.amountwithmutex.syncmethod.nostaticfun;

public class FetchMoney1 {
    public static void main(String[] args) {
        Account account = new Account(1000);
        /**
         * 同一个账户上进行2个取款操作
         */
        Thread atm = new Thread(new WithdrawThread(account, 600)); // 从atm取600
        Thread bank = new Thread(new WithdrawThread(account, 800)); // 从银行取800
        atm.start();
        bank.start();
    }

}
