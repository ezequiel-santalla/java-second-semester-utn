package model;

import enums.TransportType;

public class Bicycle {
    private String serialNumber;
    private TransportType type;

    public Bicycle() {
    }

    public Bicycle(String serialNumber, TransportType type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "serialNumber='" + serialNumber + '\'' +
                ", type=" + type +
                '}';
    }
}
