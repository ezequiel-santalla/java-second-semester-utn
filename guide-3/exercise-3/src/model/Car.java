package model;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, String model, Integer maxVelocity) {
        super(brand, model, maxVelocity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxVelocity=" + maxVelocity +
                "} ";
    }
}
