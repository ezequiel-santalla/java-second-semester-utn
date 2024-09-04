package model;

import enums.TransportType;

public class Tram {
    private String route;
    private int capacity;
    private TransportType type;

    public Tram() {
    }

    public Tram(String route, int capacity, TransportType type) {
        this.route = route;
        this.capacity = capacity;
        this.type = type;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "route='" + route + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
