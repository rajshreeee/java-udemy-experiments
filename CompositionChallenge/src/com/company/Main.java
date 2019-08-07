package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Door door = new Door("red");
        Window window = new Window(false);

        House house = new House(door, window);

        System.out.println(house.getWindow().getDoesSlide());
        System.out.println(house.getColorOfDoor());

    }
}
