package com.demo;

public class BankAccount {
    public String bankname = "ABC bank";
    private double balance = 0;
    protected String accountType = "Saving";
    String branch = "Main";   //default access

    public void deposit(double amount){
        balance += amount;
    }
    public double getbalance(){
        return balance;
    }
    private void audit(){
        System.out.println("Internal Check");
    }
}