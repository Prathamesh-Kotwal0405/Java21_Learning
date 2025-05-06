package com.prathamesh.exercise10;

abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public String displayInfo() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
