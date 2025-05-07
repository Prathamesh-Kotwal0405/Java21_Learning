package com.prathamesh.exercise10;

public class TestExercise10 {

    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(20);
        System.out.println(fullTimeEmployee.displayInfo());
        System.out.println(fullTimeEmployee.calculateSalary());
        Employee partTimeEmployee = new PartTimeEmployee(20);
        System.out.println(partTimeEmployee.displayInfo());
        System.out.println(partTimeEmployee.calculateSalary());

    }



}
