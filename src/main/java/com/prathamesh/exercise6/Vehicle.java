package com.prathamesh.exercise6;

public class Vehicle {
    protected String colour;
    protected double speed;

    public Vehicle(String colour, double speed) {
        this.colour = colour;
        this.speed = speed;
    }

    public void showInfo(){
        System.out.println("Car colour : "+colour);
        System.out.println("Car speed : "+speed);
    }
}
