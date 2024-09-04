package model;

import java.util.UUID;

public class Fish extends Animal {
    public Fish() {
    }

    public Fish(UUID id, int age, int health, double strength) {
        super(id, age, health, strength);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + id + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", strength=" + strength +
                "} ";
    }
}
