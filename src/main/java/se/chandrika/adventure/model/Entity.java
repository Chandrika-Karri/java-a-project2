package se.chandrika.adventure.model;

public abstract class Entity {

    private String role;
    private int health;
    int damage;

    public Entity(String role, int health, int damage) {
        this.role = role;
        this.health = health;
        this.damage = damage;
    }

    public String getRole() {
        return role;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void punch(Entity toPunch) {
        toPunch.takeHit(this.damage);
    }

    public void takeHit(int damage) {
        this.health -= damage;
    }

    public boolean isConscious() {
        if (this.health > 0) {
            return true;
        } else {
            return false;
        }
    }

}
