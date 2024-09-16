package model;

import enums.Position;

import java.util.UUID;

public class Footballer extends Member {
    private Integer shirtNumber;
    private Position position;

    public Footballer(UUID ID, String name, String lastName, Integer age, Integer shirtNumber, Position position) {
        super(ID, name, lastName, age);
        this.shirtNumber = shirtNumber;
        this.position = position;
    }

    public Integer getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(Integer shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "shirtNumber=" + shirtNumber +
                ", position=" + position +
                "} " + super.toString();
    }
}
