package interfaces;

import model.Vehiculo;

public interface IVehiculoAereo extends IVehiculo {
    void guardarEnHangar();
    void despegar();
    void aterrizar();
}
