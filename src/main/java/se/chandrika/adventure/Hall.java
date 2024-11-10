package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

import static se.chandrika.adventure.IntruderConfrontation.getScanner;

public class Hall implements Room, Delayable {

    @Override
    public void enter(Resident resident, Burgler burgler) {
        IntruderConfrontation game = new IntruderConfrontation();

        if (RoomType.currentLocation.equals(RoomType.LIVING_ROOM)) {
            delay(1000);

            RoomType.currentLocation = RoomType.HALL;


            System.out.println("You are in the hall and the thief is hiding here. Do you want to fight with him?");
            System.out.println("Do you want to attack the theif?fight/nofight");

            String reaction = getScanner().nextLine();
            if (reaction.equals("fight")) {

                while (burgler.isConscious() && resident.isConscious()) {

                    game.battleBegins();

                }
                if (!resident.isConscious()) {
                    System.out.println("Resident is unconsicous.You lost the game");
                    game.stopGame();

                } else if (!burgler.isConscious()) {

                    System.out.println("The thief is unconscious.What do you want to do now?");

                }
            } else if (reaction.equals("nofight")) {

                System.out.println("kick him out of the house by threatning him");
                game.stopGame();
            }
        } else {

            System.out.println("Go to the central place first");

        }

    }

}