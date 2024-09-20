import enums.EstiloAuto;
import model.Auto;
import model.Avion;
import model.Helicoptero;
import model.Vehiculo;
import service.GestionDeFlota;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto1 = new Auto("Reanult", "12", 2005, EstiloAuto.SEDAN);
        Vehiculo auto2 = new Auto("Chevrolet", "Corolla", 2017, EstiloAuto.CUPE);
        Vehiculo auto3 = new Auto("Mercedes", "M8", 2023, EstiloAuto.SEDAN);

        Vehiculo avion1 = new Avion("Xia", "1", 1987, 12);
        Vehiculo avion2 = new Avion("Laple", "2", 1965, 15);
        Vehiculo avion3 = new Avion("AirForce", "3", 1999, 26);

        Vehiculo helicoptero1 = new Helicoptero("Pirulo", "D10", 2010, 5488);
        Vehiculo helicoptero2 = new Helicoptero("Helic1", "Benz", 2007, 7600);
        Vehiculo helicoptero3 = new Helicoptero("Flotando", "Ni idea", 2024, 9865);

        GestionDeFlota gestionDeFlota = new GestionDeFlota();

        gestionDeFlota.agregarVehiculoAFlota(auto1);
        gestionDeFlota.agregarVehiculoAFlota(auto2);
        gestionDeFlota.agregarVehiculoAFlota(auto3);
        gestionDeFlota.agregarVehiculoAFlota(avion1);
        gestionDeFlota.agregarVehiculoAFlota(avion2);
        gestionDeFlota.agregarVehiculoAFlota(avion3);
        gestionDeFlota.agregarVehiculoAFlota(helicoptero1);
        gestionDeFlota.agregarVehiculoAFlota(helicoptero2);
        gestionDeFlota.agregarVehiculoAFlota(helicoptero3);

        System.out.println();
        gestionDeFlota.mostrarFlota();

        System.out.println();
        gestionDeFlota.mostrarFlotaOrdenadaPorMarca();

        System.out.println();
        gestionDeFlota.despegueDeVehiculosAereos();
    }
}