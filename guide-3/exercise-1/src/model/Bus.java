package model;

import enums.TransportType;

public class Bus {
    private int lineNumber;
    private int capacity;
    private TransportType type;

    public Bus() {
    }

    public Bus(int lineNumber, int capacity, TransportType type) {
        this.lineNumber = lineNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
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
        return "Bus{" +
                "lineNumber=" + lineNumber +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
