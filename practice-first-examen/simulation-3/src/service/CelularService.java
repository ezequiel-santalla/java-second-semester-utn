package service;

import interfaces.ConectividadInalambrica;

public class CelularService implements ConectividadInalambrica {

    @Override
    public void conectarWifi() {
        System.out.println("Soy un celular y me estoy conectando al wifi...");
    }

    @Override
    public void conectarBluetooth() {
        System.out.println("Soy un celular y me estoy conectando al Bluetooth...");
    }
}
