package interfaces;

public interface VehiclesCargo extends Vehicle {
    @Override
    void start();

    @Override
    void stop();

    @Override
    void turn();

    void pickUpCargo();

    Integer getCargoCapacity();
}
