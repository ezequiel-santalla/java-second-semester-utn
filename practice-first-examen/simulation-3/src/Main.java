import enums.Categoria;
import enums.Marca;
import enums.Usuario;
import model.AccesorioTech;
import model.Celular;
import model.Computadora;
import model.Producto;
import service.ProductoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        Producto comp1 = new Computadora("Dell Inspiron 15", 8000.0, Marca.DELL);
        Producto comp2 = new Computadora("Lenovo 57", 7500.0, Marca.LENOVO);
        Producto comp3 = new Computadora("Samsung", 10000.0, Marca.SAMSUNG);

        Producto accTech1 = new AccesorioTech("Funda celular", 2300.0, Marca.XIAOMI);
        Producto accTech2 = new AccesorioTech("Mouse", 1700.0, Marca.MOTOROLA);
        Producto accTech3 = new AccesorioTech("Reloj", 3500.0, Marca.APPLE);

        Producto cel1 = new Celular("Moto G82", 5600.0, Marca.MOTOROLA);
        Producto cel2 = new Celular("XIAOMI 12", 6700.0, Marca.XIAOMI);
        Producto cel3 = new Celular("Iphone 14", 8900.0, Marca.APPLE);

        ProductoService productoService = new ProductoService();

        System.out.println();
        productoService.agregarProducto(comp1, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(comp2, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(comp3, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(accTech1, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(accTech2, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(accTech3, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(cel1, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(cel2, Usuario.ADMINISTRADOR, listaProductos);
        productoService.agregarProducto(cel3, Usuario.ADMINISTRADOR, listaProductos);
        productoService.mostrarProductos(listaProductos);
        System.out.println();

        productoService.filtrarPorCategoria(Categoria.CELULAR, listaProductos);
        productoService.filtrarPorCategoria(Categoria.COMPUTADORA, listaProductos);
        productoService.filtrarPorCategoria(Categoria.ACCESORIO, listaProductos);
        System.out.println();

        System.out.println("Productos filtrados por precio");
        System.out.println();
        productoService.filtrarPorPrecios(6000., 10000.0, listaProductos);
        System.out.println();

        System.out.println("Productos ordenados por precio");
        System.out.println();
        productoService.mostrarListaOrdenada(listaProductos);
        System.out.println();

        productoService.eliminarProducto(comp2, Usuario.ADMINISTRADOR, listaProductos);
        System.out.println("Productos sin el eliminado");
        System.out.println();
        productoService.mostrarProductos(listaProductos);

        System.out.println();
        System.out.println("Productos filtrados por marca");
        System.out.println();
        productoService.filtrarCelularPorMarca(Marca.APPLE, listaProductos);
    }
}