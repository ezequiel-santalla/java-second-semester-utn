package model;

import enums.TipoVehiculo;
import interfaces.Deportivo;

import java.util.UUID;

public class Carrera extends Automovil implements Deportivo {
    private Integer velocidadMaxima;

    public Carrera(String nombreModelo, Double precio, TipoVehiculo tipoVehiculo, Integer cantMaxAirbag, Integer velocidadMaxima) {
        super(nombreModelo, precio, tipoVehiculo, cantMaxAirbag);
        this.velocidadMaxima = velocidadMaxima;
    }

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Integer velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public Double actualizarValorPrecio(Double aumento) {
        return precio * aumento;
    }

    @Override
    public void competirEnPista() {
        System.out.println("Soy el automovil " + nombreModelo + " de carrera y estoy compitiendo en pista...");
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "tipoVehiculo=" + tipoVehiculo +
                ", nombreModelo='" + nombreModelo + '\'' +
                ", precio=" + precio +
                ", cantMaxAirbag=" + cantMaxAirbag +
                ", velocidadMaxima=" + velocidadMaxima +
                "} ";
    }
}

