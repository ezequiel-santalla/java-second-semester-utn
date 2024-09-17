package service;

import model.*;

import java.util.*;

public class Lista {
    List<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void getVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }
}