package com.will.basics.mutex.amountwithmutex.syncmethod.nostaticfun2;

/**
 * 取钱的动作
 */
public class DepositThread implements Runnable {
    private Account account;
    private int amount;

    /**
     * 从账户a中取钱amount金额
     *
     * @param account 账户
     * @param amount  金额
     */
    public DepositThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("存入了" + account.deposit(amount));
    }
}
