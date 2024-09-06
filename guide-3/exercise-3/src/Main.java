import model.Bus;
import model.Car;
import model.Truck;
import service.BusService;
import service.CarService;
import service.TruckService;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 220);
        CarService carService = new CarService();

        Truck t1 = new Truck("Iveco", "I54", 160);
        TruckService truckService = new TruckService();

        Bus b1 = new Bus("Mercedes", "Benz", 140);
        BusService busService = new BusService();

        System.out.println(c1);
        System.out.println(t1);
        System.out.println(b1);
        System.out.println();

        System.out.println("The capacity of the car is: " + carService.getPeopleCapacity());
        System.out.println("The capacity of the bus is: " + busService.getPeopleCapacity());
        System.out.println("The capacity of the truck's cargo is: " + truckService.getCargoCapacity());
    }
}