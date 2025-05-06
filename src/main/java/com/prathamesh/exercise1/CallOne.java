package com.prathamesh.exercise1;

import java.util.ArrayList;
import java.util.List;

public class CallOne {
    public static void main(String[] args) {
        Book b1 = new Book("title1","author1",200);
        Book b2 = new Book("title2","author2",230);
        Book b3 = new Book("title3","author3",240);

        System.out.println("Book 1 is:" + b1.getDetails());
        System.out.println("Book 2 is:" + b2.getDetails());
        System.out.println("Book 3 is:" + b3.getDetails());
    }
}
