package model;

public class Truck extends Vehicle {
    public Truck() {
    }

    public Truck(String brand, String model, Integer maxVelocity) {
        super(brand, model, maxVelocity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxVelocity=" + maxVelocity +
                "} ";
    }
}
