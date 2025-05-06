package com.prathamesh.exercise7;

public class Square extends Shape{
    public double length;

    public Square(int side, double length) {
        super(side);
        this.length = length;
    }

    public String area(){
        return "Area of Square is : "+length*length + "\nwith sides: " + side;
    }
}
