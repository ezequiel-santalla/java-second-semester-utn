package service;

import interfaces.VehiclesCargo;

public class TruckService implements VehiclesCargo {
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
    public void pickUpCargo() {
        System.out.println("The cargo has been picked up");
    }

    @Override
    public Integer getCargoCapacity() {
        return 250;
    }
}
