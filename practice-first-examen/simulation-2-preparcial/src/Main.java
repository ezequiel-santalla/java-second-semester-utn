import enums.TipoVehiculo;
import model.*;
import service.Lista;

public class Main {
    public static void main(String[] args) {
        Carrera autoCarrera = new Carrera("McLaren", 15000., TipoVehiculo.CARRERA, 2, 380);
        Motocicleta motocicleta = new Motocicleta("Honda", 25000., TipoVehiculo.MOTOCICLETA, 200);
        Utilitario utilitario = new Utilitario("Peugeot", 45000.0, TipoVehiculo.UTILITARIO, 5000, 1.95);
        Urbano urbano = new Urbano("Fiat", 8000.0, TipoVehiculo.URBANO, 4);

        autoCarrera.competirEnPista();
        motocicleta.competirEnPista();

        Lista listas = new Lista();

        listas.agregarVehiculo(autoCarrera);
        listas.agregarVehiculo(motocicleta);
        listas.agregarVehiculo(utilitario);
        listas.agregarVehiculo(urbano);

        System.out.println();
        System.out.println("Lista de vehiculos");
        System.out.println();
        listas.getVehiculos();
        System.out.println();

        autoCarrera.setPrecio(autoCarrera.actualizarValorPrecio(1.2));
        motocicleta.setPrecio(motocicleta.actualizarValorPrecio(1.05));
        urbano.setPrecio(urbano.actualizarValorPrecio(1.15));
        utilitario.setPrecio(utilitario.actualizarValorPrecio(1.1));

        System.out.println("Lista de vehiculos con precios actualizados");
        System.out.println();
        listas.getVehiculos();
    }
}