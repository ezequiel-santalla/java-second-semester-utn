package model;

import enums.TipoVehiculo;
import interfaces.Deportivo;

public class Motocicleta extends Vehiculo implements Deportivo {
    private Integer cilindrada;

    public Motocicleta(String nombreModelo, Double precio, TipoVehiculo tipoVehiculo, Integer cilindrada) {
        super(nombreModelo, precio, tipoVehiculo);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public Double actualizarValorPrecio(Double aumento) {
        return precio * aumento;
    }

    @Override
    public void competirEnPista() {
        System.out.println("Soy la motocicleta " + nombreModelo + " de carrera y estoy compitiendo en pista...");
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "tipoVehiculo=" + tipoVehiculo +
                ", nombreModelo='" + nombreModelo + '\'' +
                ", precio=" + precio +
                ", cilindrada=" + cilindrada +
                "} ";
    }
}
