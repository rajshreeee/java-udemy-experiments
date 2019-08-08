package com.anishsilwal.composition;

public class Door {

    private String name;

    public Door() {
        this("Entrance Door");
    }

    public Door(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Door Opened.");
    }

    public void close() {
        System.out.println("Door Closed");
    }

}
