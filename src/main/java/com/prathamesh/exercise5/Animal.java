package com.prathamesh.exercise5;

public sealed class Animal permits Cat,Dog {
    void makeSound(){
        System.out.println("Animals have different sounds");
    }
}
