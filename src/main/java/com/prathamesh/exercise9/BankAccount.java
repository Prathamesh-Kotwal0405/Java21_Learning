package com.prathamesh.exercise9;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(int amount){
        if(amount>0 && amount<balance){
            balance -=amount;
            System.out.println("Amount of Rs: " + amount + "debited from your account : "+accountNumber);
        }else{
            System.out.println("Invalid amount !!");
        }
    }

    public void deposit(int amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Amount of Rs: " + amount + "credited to your account : " +accountNumber);
        }else{
            System.out.println("Invalid amount !!");
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1235000,10000);
        ba.deposit(20000);
        ba.withDraw(40000);
        ba.withDraw(20000);
    }
}
