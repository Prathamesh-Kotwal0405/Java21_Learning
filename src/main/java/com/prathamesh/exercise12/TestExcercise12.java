package com.prathamesh.exercise12;



public class TestExcercise12 {
    public static void main(String[] args) {
        Engine eng = new Engine(83,1200);
        Car car = new Car("Tata","Punch",eng);
        TestExcercise12 testExcercise12 = new TestExcercise12();
        testExcercise12.displayCarInfo(car);
    }

    public void displayCarInfo(Car car){
        System.out.println("Manufacturer : "+car.getManufacturerName());
        System.out.println("Model : "+car.getModelName());
        System.out.println("Engine Horse power : "+car.getEngine().getHp());
        System.out.println("Engine Capacity : "+car.getEngine().getCc());
    }
}
