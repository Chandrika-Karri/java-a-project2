package se.chandrika.adventure.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentTest {

    @Test
    void setDamage() {
        Resident resident = new Resident("Resident",12,3);
        Burgler burgler = new Burgler("Burgler",12,4);
        resident.setDamage(resident.getDamage()+3);
        assertEquals(6,resident.getDamage());
    }
}