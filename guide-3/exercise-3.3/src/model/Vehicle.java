package model;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Integer maxVelocity;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer maxVelocity) {
        this.brand = brand;
        this.model = model;
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(Integer maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
