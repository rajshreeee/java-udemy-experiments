package com.company;

public class Ford extends Car{
//remember you can't do this.name and stuff here
    public Ford(String name, int cylinders){
        super( name, cylinders);

    }

    @Override
    public String startEngine() {
        return "wheels"+ getName();//can't keep name here!
    }
}
