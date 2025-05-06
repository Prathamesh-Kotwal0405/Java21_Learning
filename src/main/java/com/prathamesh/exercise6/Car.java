package com.prathamesh.exercise6;

public class Car extends Vehicle{
    private double price;
    public Car(String colour, double speed,double price){
        super(colour,speed);
        this.price = price;
    }
    public void CarInfo(){
        showInfo();
        System.out.println("Price : "+price);
    }
}
