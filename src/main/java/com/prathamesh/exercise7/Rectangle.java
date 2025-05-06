package com.prathamesh.exercise7;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(int side, double length, double width) {
        super(side);
        this.length = length;
        this.width = width;
    }

    public String area(){
        return "Area of Rectangle is : "+length*width + "\nwith sides: "+side;
    }
}
