package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

import static se.chandrika.adventure.IntruderConfrontation.getScanner;
import static se.chandrika.adventure.IntruderConfrontation.stopGame;


public class Office implements Room, Delayable {
    @Override
    public void enter(Resident resident, Burgler burgler) {
        IntruderConfrontation game = new IntruderConfrontation();

        if (RoomType.currentLocation.equals(RoomType.LIVING_ROOM)) {
            delay(1000);

            RoomType.currentLocation = RoomType.OFFICE;

            if (burgler.isConscious() && resident.isConscious())

                System.out.println("You are in office,nothing found here.Search other room.");

            if (!burgler.isConscious()) {

                System.out.println("You found a phone here to inform the police");
                System.out.println("Do you want to call the police?YES/NO");
                String decision = getScanner().nextLine();

                if (decision.equals("YES")) {

                    delay(2000);
                    System.out.println("Calling Police......");
                    System.out.println("Police arrived, secured the thief in handcuffs");
                    System.out.println("Congratulations,you won the game.");
                    game.stopGame();

                } else {

                    System.out.println("The thief is bleeding......Call 112");
                    game.stopGame();

                }

            }
        } else {
            System.out.println("Go to the central place first");
        }

    }

}
