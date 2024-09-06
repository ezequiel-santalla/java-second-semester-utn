import model.Bicycle;
import model.Bus;
import model.Tram;
import service.BicycleService;
import service.BusService;
import service.TramService;

import static enums.TransportType.BUS;
import static enums.TransportType.TRAM;
import static enums.TransportType.BICYCLE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Guide 3 - exercise 1");
        System.out.println();

        Bus bus1 = new Bus(541, 40, BUS);
        BusService busService = new BusService();

        Tram tram1 = new Tram("226", 60, TRAM);
        TramService tramService = new TramService();

        Bicycle bicycle1 = new Bicycle("6597329865", BICYCLE);
        BicycleService bicycleService = new BicycleService();

        System.out.println(bus1);
        System.out.println();
        busService.start();
        busService.stop();
        System.out.println("The capacity for the bus is: " + busService.getCapacity(bus1.getCapacity()) + " passengers");
        System.out.println(busService.announceStop("Estrada"));
        System.out.println();

        System.out.println(tram1);
        System.out.println();
        tramService.start();
        tramService.stop();
        System.out.println("The capacity for the tram is: " + tramService.getCapacity(tram1.getCapacity()) + " passengers");
        System.out.println("The new rail is: " + tramService.newRail(32));
        System.out.println();

        System.out.println(bicycle1);
        System.out.println();
        bicycleService.start();
        bicycleService.stop();
        System.out.println("The capacity for the bicycle is: " + bicycleService.getCapacity(1));
        System.out.println("The new height for the seat is: " + bicycleService.adjustSeat(120) + " centimeters");
    }
}