package service;

import enums.Categoria;
import enums.Marca;
import enums.Usuario;
import model.Producto;

import java.util.List;

public class ProductoService {

    // Filtrar productos dada una categoria
    public void filtrarPorCategoria(Categoria c, List<Producto> lista) {
        for (Producto p : lista) {
            if (p.getCategoria().equals(c)) {
                System.out.println(p);
            }
        }
    }

    // Filtrar celular por marca
    public void filtrarCelularPorMarca(Marca m, List<Producto> lista) {
        for (Producto p : lista) {
            if (p.getCategoria().equals(Categoria.CELULAR) && p.getMarca().equals(m)) {
                System.out.println(p);
            }
        }
    }

    // Filtrar productos segun un rango de precios
    public void filtrarPorPrecios(Double precioMenor, Double precioMayor, List<Producto> lista) {
        for (Producto p : lista) {
            if (p.getPrecio() >= precioMenor && p.getPrecio() <= precioMayor) {
                System.out.println(p);
            }
        }
    }

    // Ordenar por precio
    private void ordenarPorPrecio(List<Producto> lista) {
        lista.sort(Producto::compareTo);
    }

    // Mostrar Lista Ordenada
    public void mostrarListaOrdenada(List<Producto> listaOrdenada) {
        ordenarPorPrecio(listaOrdenada);

        for (Producto p : listaOrdenada) {
            System.out.println(p);
        }
    }

    // Alta
    public void agregarProducto(Producto p, Usuario usuario, List<Producto> lista) {
        if (usuario.equals(Usuario.ADMINISTRADOR)) {
            lista.add(p);
        }
    }

    // Baja
    public void eliminarProducto(Producto p, Usuario usuario, List<Producto> lista) {
        if (usuario.equals(Usuario.ADMINISTRADOR)) {
            lista.remove(p);
        }
    }

    // Mostrar Productos
    public void mostrarProductos(List<Producto> lista) {
        for (Producto p : lista) {
            System.out.println(p);
        }
    }
}
