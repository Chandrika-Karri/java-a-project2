package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

public class Bedroom implements Room, Delayable {
    @Override
    public void enter(Resident resident, Burgler burgler) {
        if (RoomType.currentLocation.equals(RoomType.LIVING_ROOM)) {
            delay(1000);
            RoomType.currentLocation = RoomType.BEDROOM;
            System.out.println("You are in bedroom, There is no thief here. Check the other other room");
        } else
            System.out.println("Go to the central place first");

    }
}
