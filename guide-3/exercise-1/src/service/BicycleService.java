package service;

import interfaces.Transport;
import model.Bicycle;

public class BicycleService implements Transport {
    @Override
    public void start() {
        System.out.println("I am the bicycle and I am starting");
    }

    @Override
    public void stop() {
        System.out.println("I am the bicycle and I am stopping");
    }

    @Override
    public int getCapacity(int capacity) {
        capacity = 1;

        return capacity;
    }

    public int adjustSeat(int height) {
        return height;
    }
}
