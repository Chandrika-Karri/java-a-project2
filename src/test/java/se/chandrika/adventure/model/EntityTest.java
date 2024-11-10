package se.chandrika.adventure.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {
    Resident resident;
    Burgler burgler;

    @BeforeEach
    void setUp() {
        resident = new Resident("Resident", 12, 3);
        burgler = new Burgler("Burgler", 12, 4);
    }

    @Test
    void takeHit() {
        burgler.takeHit(3);
        assertEquals(9, burgler.getHealth());
    }

    @Test
    void punchTest() {
        resident.punch(burgler);
        assertEquals(9, burgler.getHealth());
    }

    @Test
    void testPunch(){
        burgler.punch(resident);
        assertEquals(8, resident.getHealth());
    }

    @Test
    void isConscious() {
        assertTrue(resident.isConscious());
        assertTrue(burgler.isConscious());
    }

    @Test
    void testIsConscious() {
        resident = new Resident("Resident", 0, 3);
        burgler = new Burgler("Burgler", 0, 4);
        assertFalse(resident.isConscious());
        assertFalse(burgler.isConscious());

    }
}