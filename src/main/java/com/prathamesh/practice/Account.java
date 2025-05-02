package com.prathamesh.practice;

public sealed interface Account permits SavingsAccount, CheckingAccount {
    public String getTypeOfAccount();
}
