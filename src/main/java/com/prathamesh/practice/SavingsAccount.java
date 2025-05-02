package com.prathamesh.practice;

public record SavingsAccount(double balance) implements Account {

    @Override
    public String getTypeOfAccount() {
        return "This is Savings account";
    }
}
