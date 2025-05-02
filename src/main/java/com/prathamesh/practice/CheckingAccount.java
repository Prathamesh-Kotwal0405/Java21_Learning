package com.prathamesh.practice;

public record CheckingAccount(double balance) implements Account{

    @Override
    public String getTypeOfAccount() {
        return "This is Checking account";
    }
}
