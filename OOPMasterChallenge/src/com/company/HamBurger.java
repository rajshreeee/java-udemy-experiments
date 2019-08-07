package com.company;

public class HamBurger {
    private String breadRoll;
    private String meat;
    private int price;
    private String name;

    HamBurger(String breadRoll, String meat, int price, String name){
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("The burger has "+breadRoll+"bread Roll. "+"The price is "+price+". The name of the burger is "+name+". This is made using "+ meat);
    }




}
