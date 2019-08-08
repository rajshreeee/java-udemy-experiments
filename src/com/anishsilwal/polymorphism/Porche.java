package com.anishsilwal.polymorphism;

public class Porche extends Car{

    public Porche() {
        super("Porche", 7);
    }

    @Override
    public void accelerate() {
        System.out.println("Flying");
    }
}
