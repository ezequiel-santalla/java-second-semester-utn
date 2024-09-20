package model;

import enums.Categoria;
import enums.Marca;

public class AccesorioTech extends Producto {
    public AccesorioTech(String nombre, Double precio, Marca marca) {
        super(nombre, Categoria.ACCESORIO, precio, marca);
    }

    @Override
    public String toString() {
        return "AccesorioTech{} " + super.toString();
    }
}
