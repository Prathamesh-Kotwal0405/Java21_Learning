package com.prathamesh.exercise10;

public class PartTimeEmployee extends Employee{
    int daysWorked;

    public PartTimeEmployee(String name, int id, int daysWorked) {
        super(name, id);
        this.daysWorked = daysWorked;
    }

    @Override
    public double calculateSalary() {
        return daysWorked*600;
    }
}
