package model;

public final class Avion extends Vehiculo {
    private Integer hrsDeAutonomia;

    public Avion(String marca, String modelo, Integer año, Integer hrsDeAutonomia) {
        super(marca, modelo, año);
        this.hrsDeAutonomia = hrsDeAutonomia;
    }

    public Integer getHrsDeAutonomia() {
        return hrsDeAutonomia;
    }

    public void setHrsDeAutonomia(Integer hrsDeAutonomia) {
        this.hrsDeAutonomia = hrsDeAutonomia;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "hrsDeAutonomia=" + hrsDeAutonomia +
                "} " + super.toString();
    }
}
