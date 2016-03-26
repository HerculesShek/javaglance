package com.will.mutex.amountwithmutex.synccode.demo1;

import com.sun.tools.corba.se.idl.InterfaceGen;

/**
 * @author Will
 * @date 16/3/24
 */
public class ManagerBalance {
    public static void main(String[] args) {
        AccountInfo info = new AccountInfo(1000, "New Bank");
        Account account1 = new Account(info);
        Account account2 = new Account(info);
        Account account3 = new Account(info);
        Thread atm = new Thread(new WithdrawThread(account1, 600));
        Thread atm2 = new Thread(new WithdrawThread(account2, 600));
        Thread bank = new Thread(new DepositThread(account3, 400));

        atm.start();
        atm2.start();
        bank.start();
    }
}
