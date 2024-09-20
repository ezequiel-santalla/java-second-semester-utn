package service;

import interfaces.ConectividadInalambrica;

public class AccesorioTechService implements ConectividadInalambrica {
    @Override
    public void conectarWifi() {
        System.out.println("Soy un accesorio tecnologico y me estoy conectando al wifi...");
    }

    @Override
    public void conectarBluetooth() {
        System.out.println("Soy un accesorio tecnologico y me estoy conectando al Bluetooth...");
    }
}
