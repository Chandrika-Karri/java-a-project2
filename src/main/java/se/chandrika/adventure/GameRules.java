package se.chandrika.adventure;

public enum GameRules {

    WELCOME_MESSAGE("WELCOME TO THE TEXT BASED ADVENTURE GAME"),

    INTRODUCTION("INTRODUCTION:" + " " + "\nOne night a resident, who is living in a four room house " +
            "has fallen asleep on the sofa in the living room, wakes up to a noise and encounters " +
            "a burglar \n in one of the rooms. A fight ensues, and it is crucial to win the fight.\n"),

    GOAL("GOAL:" + " " + "\nTo win the fight, the resident must first find a frying pan in the kitchen. The " +
            "frying pan increases the resident's ability to inflict more damage. Once \n the " +
            "burglar is defeated, the police must be informed. The game ends when the police " +
            "are notified successfully.\n"),

    GAME_RULES("GAME_RULES:" + " " + "\nThere is a central place in the game and four other rooms. Living Room is the central place" +
            "From the central place, you can move to one of the four other \n rooms. From those rooms, you can only " +
            "return to the central place.\n");

    private final String description;

    GameRules(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
