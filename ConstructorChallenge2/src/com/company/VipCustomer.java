package com.company;

public class VipCustomer {

    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer(String name, long creditLimit, String email){
        System.out.println("I am the constructor that accepts all three values");
        this.name = name;
        this.creditLimit= creditLimit;
        this.email = email;
    }

    public VipCustomer(){
        this("rajshree", 30, "rajshreerai@lftech.com");
        System.out.println("I am the constructor that accepts no values");
    }

    public VipCustomer(String name, long creditLimit){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email="nobody@gmail.com";
        System.out.println("I am the constructor that accepts only two values");
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
	// write your code here
        VipCustomer one = new VipCustomer("robert", 345, "robot@gmail.com");
        VipCustomer two = new VipCustomer();
        VipCustomer three = new VipCustomer("Sita", 333);
        System.out.println(one.getEmail());
        System.out.println(two.getCreditLimit());
        System.out.println(three.getName());
    }
}
