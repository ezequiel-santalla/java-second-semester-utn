package model;

import java.util.UUID;

public class Animal {
    protected UUID id;
    protected int age;
    protected int health;
    protected double strength;

    public Animal() {
    }

    public Animal(UUID id, int age, int health, double strength) {
        this.id = id;
        this.age = age;
        this.health = health;
        this.strength = strength;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
