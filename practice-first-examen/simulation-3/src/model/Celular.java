package model;

import enums.Categoria;
import enums.Marca;

public class Celular extends Producto {
    public Celular(String nombre, Double precio, Marca marca) {
        super(nombre, Categoria.CELULAR, precio, marca);
    }

    @Override
    public String toString() {
        return "Celular{} " + super.toString();
    }
}
