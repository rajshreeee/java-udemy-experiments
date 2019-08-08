package com.anishsilwal.composition;

public class Challenge {

    public static void run () {
        Door door = new Door();
        AirConditioner airConditioner = new AirConditioner(20);

        Room room = new Room(door, airConditioner);

        room.getEntranceDoor().open();
        room.getEntranceDoor().close();

        room.changeRoomTemp(5);
    }

}
