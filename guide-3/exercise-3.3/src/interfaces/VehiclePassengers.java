package interfaces;

public interface VehiclePassengers extends Vehicle {
    @Override
    void start();

    @Override
    void stop();

    @Override
    void turn();

    void pickUpPassenger();

    Integer getPeopleCapacity();
}
