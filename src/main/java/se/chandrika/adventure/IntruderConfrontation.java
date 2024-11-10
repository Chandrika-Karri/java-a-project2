package se.chandrika.adventure;


import java.util.Scanner;

import se.chandrika.adventure.model.*;

public class IntruderConfrontation implements Delayable {

    private static Resident resident = new Resident("Resident", 12, 3);

    private static Burgler burgler = new Burgler("Thief", 12, 4);

    Room kitchen = RoomFactory.createRoom(RoomType.KITCHEN);
    Room bedroom = RoomFactory.createRoom(RoomType.BEDROOM);
    Room hall = RoomFactory.createRoom(RoomType.HALL);
    Room office = RoomFactory.createRoom(RoomType.OFFICE);
    Room living = RoomFactory.createRoom(RoomType.LIVING_ROOM);
    Room guestroom = RoomFactory.createRoom(RoomType.GUESTROOM);
    private static Scanner scanner = new Scanner(System.in);
    private static boolean run = true;

    public static void stopGame() {
        run = false;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public void start() {

        printWelcomeMenu();
        living.enter(resident, burgler);
        System.out.println();
        while (run && resident.isConscious()) {

            String userInput = getUserInput();
            processInput(userInput);

        }
        scanner.close();
    }

    private void printWelcomeMenu() {
        int width = 120;
        int padding = (width - GameRules.WELCOME_MESSAGE.getDescription().length()) / 2;
        System.out.printf("%" + padding + "s%s%n", " ", GameRules.WELCOME_MESSAGE.getDescription());
        System.out.println();
        delay(2000);

        System.out.println(GameRules.INTRODUCTION.getDescription());
        System.out.println();
        delay(2000);

        System.out.println(GameRules.GOAL.getDescription());
        System.out.println();
        delay(2000);

        System.out.println(GameRules.GAME_RULES.getDescription());
        System.out.println();
        delay(2000);
    }

    private String getUserInput() {
        System.out.println();
        System.out.println("Enter your next move");

        return scanner.nextLine();
    }

    void processInput(String userInput) {

        switch (userInput) {
            case "kitchen" -> kitchen.enter(resident, burgler);
            case "office" -> office.enter(resident, burgler);
            case "hall" -> hall.enter(resident, burgler);
            case "living room" -> living.enter(resident, burgler);
            case "bed room" -> bedroom.enter(resident, burgler);
            case "guest room" -> guestroom.enter(resident, burgler);
            case "fight" -> battleBegins();
            case "quit" -> {
                run = false;
                System.out.println("Game has been terminated");
            }
            default -> System.out.println("Invalid input");
        }
    }

    void performAttack(Entity attacker, Entity defender) {

        attacker.punch(defender);

        System.out.println(attacker.getRole() + " " + "attacks" + " " + defender.getRole());
        System.out.println(defender.getRole() + " " + "health is:" + " " + defender.getHealth());

        if (defender.isConscious()) {
            System.out.println(defender.getRole() + " " + "is conscious");
            System.out.println();

        } else {
            System.out.println(defender.getRole() + " " + "is unconscious");


        }

    }

    public void battleBegins() {
        delay(3000);

        if (!RoomType.currentLocation.equals(RoomType.HALL)) {
            System.out.println("No monster,No fight");
            return;
        }
        performAttack(resident, burgler);

        if (burgler.isConscious()) {
            performAttack(burgler, resident);

        }

    }

}
