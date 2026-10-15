package com.other;
import com.demo.*;

public class OutsideTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(acc.bankname);
        //System.out.println(acc.accountType);
        //System.out.println(acc.branch);
        //System.out.println(acc.balance);
        //acc.audit();
        acc.deposit(500);
        System.out.println(acc.getbalance());
    }
}