package service;

import interfaces.IVehiculoAereo;

public class AvionService extends VehiculoService implements IVehiculoAereo {
    @Override
    public void darAltaAlquiler() {

    }

    @Override
    public void darBajaAlquiler() {

    }

    @Override
    public void guardarEnHangar() {

    }

    @Override
    public void despegar() {
        System.out.println("Soy un avion y estoy despegando...");
    }

    @Override
    public void aterrizar() {

    }
}
