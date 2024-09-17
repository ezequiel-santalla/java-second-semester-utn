package model;

import enums.TipoVehiculo;

import java.util.UUID;

public class Urbano extends Automovil {
    private Integer cantMaxOcupantes;

    public Urbano(String nombreModelo, Double precio, TipoVehiculo tipoVehiculo, Integer cantMaxAirbag) {
        super(nombreModelo, precio, tipoVehiculo, cantMaxAirbag);
    }

    public Integer getCantMaxOcupantes() {
        return cantMaxOcupantes;
    }

    public void setCantMaxOcupantes(Integer cantMaxOcupantes) {
        this.cantMaxOcupantes = cantMaxOcupantes;
    }

    @Override
    public Double actualizarValorPrecio(Double aumento) {
        return precio * aumento;
    }

    @Override
    public String toString() {
        return "Urbano{" +
                "tipoVehiculo=" + tipoVehiculo +
                ", nombreModelo='" + nombreModelo + '\'' +
                ", precio=" + precio +
                ", cantMaxAirbag=" + cantMaxAirbag +
                ", cantMaxOcupantes=" + cantMaxOcupantes +
                "} ";
    }
}
