package com.will.mutex.amountwithmutex.synccode.demo1;

/**
 * 银行账户信息
 *
 * @author Will
 */
public class AccountInfo {
    private double balance;
    private String bankName;

    public AccountInfo(double balance, String bankName) {
        this.balance = balance;
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }
    
}
