package com.prathamesh.exercise4;

public final class Square extends Rectangle{


    public Square(int length) {
        super(length);
    }

    private double area(int side){
        return side*side;
    }

    public static void main(String[] args) {
        Rectangle s = new Square(2);
        System.out.println(s.area(2,2));
    }
}
