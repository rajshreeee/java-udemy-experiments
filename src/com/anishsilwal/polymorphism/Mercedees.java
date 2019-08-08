package com.anishsilwal.polymorphism;

public class Mercedees extends Car{

    public Mercedees() {
        super("Mercedees", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("VROOM!");
    }

    @Override
    public void brake() {
        System.out.println("Coming to stop.");
    }
}

