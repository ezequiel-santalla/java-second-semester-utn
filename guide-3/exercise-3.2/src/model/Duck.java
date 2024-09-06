package model;

import java.util.UUID;

public class Duck extends Animal {
    public Duck() {
    }

    public Duck(UUID id, int age, int health, double strength) {
        super(id, age, health, strength);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", strength=" + strength +
                "} ";
    }
}
