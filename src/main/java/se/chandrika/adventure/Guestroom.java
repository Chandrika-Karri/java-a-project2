package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

public class Guestroom implements Room, Delayable {
    @Override
    public void enter(Resident resident, Burgler burgler) {
        delay(1000);
        System.out.println("You are in Guestroom.It is quiet and calm.Search other rooms.");
    }

}
