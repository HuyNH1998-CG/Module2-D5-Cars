package com.codegym;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return this.name;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEngine(String newEngine) {
        this.engine = newEngine;
    }
}
