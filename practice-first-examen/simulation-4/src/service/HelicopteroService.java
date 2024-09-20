package service;

import interfaces.IVehiculoAereo;

public class HelicopteroService extends VehiculoService implements IVehiculoAereo {
    @Override
    public void guardarEnHangar() {

    }

    @Override
    public void despegar() {
        System.out.println("Soy un helicoptero y estoy despegando...");
    }

    @Override
    public void aterrizar() {

    }

    @Override
    public void darAltaAlquiler() {

    }

    @Override
    public void darBajaAlquiler() {

    }
}
