package com.prathamesh.exercise12;

public class Car {

    private String manufacturerName;
    private String modelName;
    private Engine engine;

    public Car(String manufacturerName, String modelName, Engine engine) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.engine = engine;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
