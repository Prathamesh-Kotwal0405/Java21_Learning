package com.prathamesh.exercise10;

public class FullTimeEmployee extends Employee {
    int daysWorked;

    public FullTimeEmployee(String name, int id, int daysWorked) {
        super(name, id);
        this.daysWorked = daysWorked;
    }

    @Override
    public double calculateSalary() {
        return daysWorked*1200;
    }
}
