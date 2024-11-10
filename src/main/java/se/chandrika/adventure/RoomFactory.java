package se.chandrika.adventure;

public class RoomFactory {

    public static Room createRoom(RoomType type) {
        switch (type) {
            case BEDROOM -> {
                return new Bedroom();
            }
            case KITCHEN -> {
                return new Kitchen();
            }
            case HALL -> {
                return new Hall();
            }
            case LIVING_ROOM -> {
                return new Livingroom();
            }
            case OFFICE -> {
                return new Office();
            }
           case GUESTROOM -> {
               return new Guestroom();
           }
        }
        return null;
    }
}
