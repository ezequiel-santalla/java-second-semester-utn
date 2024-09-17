package model;

import enums.TipoVehiculo;

import java.util.UUID;

public abstract class Vehiculo {
    protected UUID ID;
    protected String nombreModelo;
    protected Double precio;
    protected TipoVehiculo tipoVehiculo;

    public Vehiculo(String nombreModelo, Double precio, TipoVehiculo tipoVehiculo) {
        this.ID = UUID.randomUUID();
        this.nombreModelo = nombreModelo;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public abstract Double actualizarValorPrecio(Double aumento);
}
