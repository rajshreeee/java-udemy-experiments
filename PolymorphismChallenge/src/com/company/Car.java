package com.company;

public class Car {
    private boolean engine;
    private String name;
    private int wheels;
    private int cylinders;

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car's Engine Started";
    }


    public Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }
}
