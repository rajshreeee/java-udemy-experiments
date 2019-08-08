package com.anishsilwal.polymorphism;

public class Ferrari extends Car{

    public Ferrari(){
        super("Ferrari", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("VROOM! VROOM!");
    }

    @Override
    public void accelerate() {
        System.out.println("Going faster.");
    }
}

