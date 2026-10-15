package com.other;
import com.demo.*;
public class Salary extends BankAccount{
    void show() {
        System.out.println(accountType); //works inherited
        BankAccount b= new BankAccount();
        //System.out.println(b.accountType);   // fails: not through a BankAccount reference
    }
}