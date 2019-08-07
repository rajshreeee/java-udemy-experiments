package com.company;

import java.awt.*;

public class House {
    private Door door;
    private Window window;

    public House(Door door, Window window){
        this.door = door;
        this.window = window;
    }

    public String getColorOfDoor(){
        return getDoor().getColor();
    }

    private Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }
}
