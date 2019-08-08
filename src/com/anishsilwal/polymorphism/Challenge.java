package com.anishsilwal.polymorphism;

public class Challenge {

    public static void testCar(Car car) {
        System.out.println("-----------------------------------------------");
        System.out.println("Car name: " + car.getName());
        System.out.println("Number of cylinders: " + car.getCylinders());
        System.out.println("Wheels: " + car.getWheels());
        System.out.println("Has Engine: " + car.hasEngine());

        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println("-----------------------------------------------");
    }

    public static void run() {
        Car genericCar = new Car("Generic Car", 2);
        Ferrari ferrari = new Ferrari();
        Mercedees mercedees = new Mercedees();
        Porche porche = new Porche();

        testCar(genericCar);
        testCar(ferrari);
        testCar(mercedees);
        testCar(porche);
    }

}
