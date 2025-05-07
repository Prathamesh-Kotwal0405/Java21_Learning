package com.prathamesh.exercise10;

public class FullTimeEmployee extends Employee {
    int daysWorked;

    public FullTimeEmployee(int daysWorked) {
        super();
        this.daysWorked = daysWorked;
    }

    @Override
    public double calculateSalary() {
        return daysWorked*1200;
    }
}
