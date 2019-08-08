package com.anishsilwal.polymorphism;

public class Car {

    protected int cylinders;
    protected String name;
    protected short wheels;
    protected boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Starting Engine");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public short getWheels() {
        return wheels;
    }

    public boolean hasEngine() {
        return engine;
    }
}

