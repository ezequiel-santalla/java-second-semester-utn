package service;

import interfaces.VehiclePassengers;

public class CarService implements VehiclePassengers {
    @Override
    public void start() {
        System.out.println("I am the car and I am starting my drive");
    }

    @Override
    public void stop() {
        System.out.println("I am the car and I am stopping");
    }

    @Override
    public void turn() {
        System.out.println("Turning...");
    }

    @Override
    public void pickUpPassenger() {
        System.out.println("The passenger has been picked up");
    }

    @Override
    public Integer getPeopleCapacity() {
        return 4;
    }
}
