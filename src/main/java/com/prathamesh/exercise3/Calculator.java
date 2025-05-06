package com.prathamesh.exercise3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        Calculator ca = new Calculator();
        System.out.println(ca.add(a,b));
        System.out.println(ca.subtract(a,b));
        System.out.println(ca.multiply(a,b));
        System.out.println(ca.divide(a,b));
    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        return a/b;
    }
}
