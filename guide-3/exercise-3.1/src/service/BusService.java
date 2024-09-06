package service;

import interfaces.Transport;

public class BusService implements Transport {
    @Override
    public void start() {
        System.out.println("I am the bus and I am starting...");
    }

    @Override
    public void stop() {
        System.out.println("I am the bus and I am stopping...");
    }

    @Override
    public int getCapacity(int capacity) {
        return capacity;
    }

    public String announceStop(String stop) {
        return "The stop is: " + stop;
    }
}
