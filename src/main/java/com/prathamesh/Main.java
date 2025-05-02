package com.prathamesh;

import com.prathamesh.practice.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //  Java 17 records and sealed interface
        Account ca = new CheckingAccount(2000);
        System.out.println("Balance in Checking Account is :t "+ca.getTypeOfAccount());
        Account sa = new SavingsAccount(2100);
        System.out.println("Balance in Savings Account is : "+sa.getTypeOfAccount());
//  Java 17 sealed classes extend classes
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bike.start();
        bike.parent();
        car.start();
        car.parent();
//  Java 17 switch call
        JavaSeventeenSwitch jsw = new JavaSeventeenSwitch();
        System.out.println(jsw.getDayByNumber(0));
//  Java 17 List.of
        List<String> skills = List.of("Java","SpringBoot","Microservices","React");
        System.out.println(skills);
//  Printing objects of a class and getting the getters
        SavingsAccount saving = new SavingsAccount(12000);
        System.out.println(saving.balance());
        CheckingAccount checking = new CheckingAccount(134000);
        System.out.println(checking.balance());
//  Switch
        Account ac = new CheckingAccount(2000);
        switch (ac){
            case CheckingAccount c -> System.out.println("Account is checking account");
            case SavingsAccount s -> System.out.println("Account is savings account");
            default -> throw new IllegalStateException("Unexpected value: " + ac);

        }
    }
}