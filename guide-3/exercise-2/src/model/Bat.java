package model;

import java.util.UUID;

public class Bat extends Animal {
    public Bat() {
    }

    public Bat(UUID id, int age, int health, double strength) {
        super(id, age, health, strength);
    }

    @Override
    public String toString() {
        return "Bat{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", strength=" + strength +
                "} ";
    }
}
