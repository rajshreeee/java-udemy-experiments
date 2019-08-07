package com.anishsilwal.challengeone;

public class VipAccount {

    private String name;
    private double creditLimit;
    private String email;

    public VipAccount(){
        this("Default Name", 10000.0d, "Default Email");
    }

    public VipAccount(String name, double creditLimit) {
        this(name, creditLimit, "Default Email");
    }

    public VipAccount(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public void showDetails (){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Account Name: " + this.getName());
        System.out.println("Credit Limit: " + this.getCreditLimit());
        System.out.println("Account Email: " + this.getEmail());
        System.out.println("--------------------------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
