package com.anishsilwal.composition;

public class Room {

    private Door entranceDoor;
    private AirConditioner airConditioner;

    public Room () {
        this(new Door(), new AirConditioner());
    }

    public Room (Door door, AirConditioner airConditioner) {
        this.entranceDoor = door;
        this.airConditioner = airConditioner;
    }

    public void changeRoomTemp (float amount) {
        System.out.println("Changeing Room Temperature");
        float currentTemp = airConditioner.getTemperature();
        System.out.println("Current Room Temperature: " + currentTemp);
        airConditioner.setTemperature(currentTemp + amount);
        System.out.println("New Room Temperature: " + airConditioner.getTemperature());
    }

    public Door getEntranceDoor () {
        return entranceDoor;
    }

}
