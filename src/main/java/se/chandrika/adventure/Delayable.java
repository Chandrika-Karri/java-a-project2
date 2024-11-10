package se.chandrika.adventure;

public interface Delayable {
    default void delay(long sleep) {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
