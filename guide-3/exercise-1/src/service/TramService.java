package service;

import interfaces.Transport;

public class TramService implements Transport {
    @Override
    public void start() {
        System.out.println("I am the tram and I am starting");
    }

    @Override
    public void stop() {
        System.out.println("I am the tram and I am stopping");
    }

    @Override
    public int getCapacity(int capacity) {
        return capacity;
    }

    public int newRail(int rail) {
        return rail;
    }
}
