package com.prathamesh.exercise6;

public class Bike extends Vehicle{
    private String regNo;
    public Bike(String colour, double speed,String regNo){
        super(colour,speed);
        this.regNo = regNo;
    }
    public void BikeInfo(){
        showInfo();
        System.out.println("Registration number : "+regNo);
    }
}
