package model;

import enums.Categoria;
import enums.Marca;

public class Computadora extends Producto {
    public Computadora(String nombre, Double precio, Marca marca) {
        super(nombre, Categoria.COMPUTADORA, precio, marca);
    }

    @Override
    public String toString() {
        return "Computadora{} " + super.toString();
    }
}
