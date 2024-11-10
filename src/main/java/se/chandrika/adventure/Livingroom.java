package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

public class Livingroom implements Room, Delayable {
    @Override
    public void enter(Resident resident, Burgler burgler) {
        if (!RoomType.currentLocation.equals(RoomType.LIVING_ROOM)) {
            delay(1000);
            RoomType.currentLocation = RoomType.LIVING_ROOM;
            System.out.println("You are in the living room. The central place of the house");

        } else if (RoomType.currentLocation.equals(RoomType.LIVING_ROOM)) {
            System.out.println("You are at central place only. You can go anywhere ");

        } else {
            System.out.println("Go to the central place");

        }

    }

}
