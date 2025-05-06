package com.prathamesh.exercise4;

public sealed class Rectangle permits Square {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int length) {
        this.length = length;
    }

    public double area(int length, int breadth){
        return length*breadth;
    }
}
