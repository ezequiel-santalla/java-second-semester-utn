package model;

import java.util.Objects;
import java.util.UUID;

public class Vehiculo implements Comparable<Vehiculo> {
    private UUID ID;
    private String marca;
    private String modelo;
    private Integer año;

    public Vehiculo(String marca, String modelo, Integer año) {
        this.ID = UUID.randomUUID();
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return Objects.equals(ID, vehiculo.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "ID=" + ID +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                '}';
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
