package com.will.basics.mutex.amountwithmutex.syncmethod.nostaticfun;

public class FetchMoney2 {
    /**
     * 在2个账户上进行取款操作
     * @param args
     */
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account(1000);

        Thread atm = new Thread(new WithdrawThread(account1, 600)); // 从atm取600
        Thread bank = new Thread(new WithdrawThread(account2, 800)); // 从银行取800
        atm.start();
        bank.start();
    }

}
