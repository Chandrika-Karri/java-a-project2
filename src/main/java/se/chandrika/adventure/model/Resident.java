package se.chandrika.adventure.model;

public class Resident extends Entity {

    public Resident(String role, int health, int damage) {
        super(role, health, damage);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
