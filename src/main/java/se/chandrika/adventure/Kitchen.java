package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

import static se.chandrika.adventure.IntruderConfrontation.getScanner;


public class Kitchen implements Room, Delayable {
    private static boolean pan = false;

    @Override
    public void enter(Resident resident, Burgler burgler) {
        if (RoomType.currentLocation.equals(RoomType.LIVING_ROOM)) {
            delay(1000);
            RoomType.currentLocation = RoomType.KITCHEN;
            System.out.println("You are in the kitchen. Nobody is here. Check other room");
            System.out.println();
            if (!pan) {

                System.out.println("Do you want to take the frying pan to attack the theif?Y/N");
                String response = getScanner().nextLine();

                if (response.equals("Y")) {

                    delay(2000);
                    resident.setDamage(resident.getDamage() + 3);
                    pan = true;
                    System.out.println("Now you have increased damage power with frying pan");
                } else {
                    System.out.println("Have the pan to have more punch power");
                }
            } else {
                System.out.println("There is no frying pan");
            }

        } else {
            System.out.println("Go to the central place first");
        }
    }

}
