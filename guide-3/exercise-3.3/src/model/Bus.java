package model;

public class Bus extends Vehicle {
    public Bus() {
    }

    public Bus(String brand, String model, Integer maxVelocity) {
        super(brand, model, maxVelocity);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxVelocity=" + maxVelocity +
                "} ";
    }
}
