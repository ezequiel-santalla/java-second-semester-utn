package model;

import enums.Categoria;
import enums.Marca;

import java.util.Objects;
import java.util.UUID;

public class Producto implements Comparable<Producto> {
    private UUID ID;
    private String nombre;
    private Categoria categoria;
    private Double precio;
    private Marca marca;

    public Producto(String nombre, Categoria categoria, Double precio, Marca marca) {
        this.ID = UUID.randomUUID();
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.marca = marca;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return Objects.equals(ID, producto.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                ", marca=" + marca +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }
}
