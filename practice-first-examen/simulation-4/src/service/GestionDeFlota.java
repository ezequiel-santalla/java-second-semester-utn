package service;

import interfaces.IVehiculoAereo;
import model.Avion;
import model.Helicoptero;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class GestionDeFlota {
    List<Vehiculo> vehiculos = new ArrayList<>();
    AvionService avionService = new AvionService();
    HelicopteroService helicopteroService = new HelicopteroService();

    public void agregarVehiculoAFlota(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrarFlota() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    private void ordenarFlotaPorMarca() {
        vehiculos.sort(Vehiculo::compareTo);
    }

    public void mostrarFlotaOrdenadaPorMarca() {
        ordenarFlotaPorMarca();

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public void despegueDeVehiculosAereos() {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Avion) {
                avionService.despegar();
            }

            if (v instanceof Helicoptero) {
                helicopteroService.despegar();
            }
        }
    }
}
