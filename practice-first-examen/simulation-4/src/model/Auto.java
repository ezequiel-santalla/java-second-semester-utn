package model;

import enums.EstiloAuto;

public final class Auto extends Vehiculo {
    private EstiloAuto estilo;

    public Auto(String marca, String modelo, Integer año, EstiloAuto estilo) {
        super(marca, modelo, año);
        this.estilo = estilo;
    }

    public EstiloAuto getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloAuto estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "estilo=" + estilo +
                "} " + super.toString();
    }
}
