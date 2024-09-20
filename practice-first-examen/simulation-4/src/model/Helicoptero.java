package model;

public final class Helicoptero extends Vehiculo {
    private Integer peso;

    public Helicoptero(String marca, String modelo, Integer año, Integer peso) {
        super(marca, modelo, año);
        this.peso = peso;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "peso=" + peso +
                "} " + super.toString();
    }
}
