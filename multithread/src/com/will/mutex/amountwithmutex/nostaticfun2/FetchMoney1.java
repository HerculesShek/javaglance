package com.will.mutex.amountwithmutex.nostaticfun2;

public class FetchMoney1 {
    public static void main(String[] args) {
        Account account = new Account(1000);
        /**
         * 同一个账户上进行2个取款操作 和 一个存款操作
         * 此例子证明 依赖于同一个实例的所有线程 当一个线程在调用此实例的某个synchronized方法的时候
         * 此实例的其余的所有的synchronized方法 其余的线程都不得调用!
         */
        Thread atm = new Thread(new WithdrawThread(account, 600)); // 从atm取600
        Thread atm2 = new Thread(new DepositThread(account, 500)); // atm中存入500
        Thread bank = new Thread(new WithdrawThread(account, 800)); // 从银行取800
        atm.start();
        bank.start();
        atm2.start();
    }

}
