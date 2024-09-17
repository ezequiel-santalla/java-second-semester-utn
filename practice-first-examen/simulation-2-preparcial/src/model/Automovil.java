package model;

import enums.TipoVehiculo;

public abstract class Automovil extends Vehiculo {
    protected Integer cantMaxAirbag;

    public Automovil(String nombreModelo, Double precio, TipoVehiculo tipoVehiculo, Integer cantMaxAirbag) {
        super(nombreModelo, precio, tipoVehiculo);
        this.cantMaxAirbag = cantMaxAirbag;
    }

    public Integer getCantMaxAirbag() {
        return cantMaxAirbag;
    }

    public void setCantMaxAirbag(Integer cantMaxAirbag) {
        this.cantMaxAirbag = cantMaxAirbag;
    }
}
