package com.prathamesh.exercise10;

public class PartTimeEmployee extends Employee{
    int daysWorked;

    public PartTimeEmployee(int daysWorked) {
        super();
        this.daysWorked = daysWorked;
    }

    @Override
    public double calculateSalary() {
        return daysWorked*600;
    }
}
