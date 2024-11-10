package se.chandrika.adventure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Entity;
import se.chandrika.adventure.model.Resident;

import static org.junit.jupiter.api.Assertions.*;

class IntruderConfrontationTest {
    Resident resident;
    Burgler burgler;
    IntruderConfrontation game;

    @BeforeEach
    void setUp() {
         resident = new Resident("Resident", 12, 3);
         burgler = new Burgler("Burgler", 12, 4);
         game = new IntruderConfrontation();

    }

    @Test
    void performAttackTest() {


        game.performAttack(resident, burgler);
        assertEquals(9, burgler.getHealth());
        assertTrue(burgler.isConscious());
    }

    @Test
    void testperformAttack() {

        game.performAttack(burgler, resident);
        assertEquals(8, resident.getHealth());
        assertTrue(resident.isConscious());
    }




}