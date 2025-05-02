package com.prathamesh.practice;

public sealed class Vehicle permits Bike, Car {
    public void start(){
        System.out.println("Vehicle is starting");
    }

    public void parent(){
        System.out.println("Vehicle permits Car and Bike");
    }
}
