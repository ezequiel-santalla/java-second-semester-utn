package model;

import enums.TipoVehiculo;

public class Utilitario extends Vehiculo {
    private Integer cantMaxKg;
    private Double altura;

    public Utilitario(String nombreModelo, Double precio, TipoVehiculo tipoVehiculo, Integer cantMaxKg, Double altura) {
        super(nombreModelo, precio, tipoVehiculo);
        this.cantMaxKg = cantMaxKg;
        this.altura = altura;
    }

    public Integer getCantMaxKg() {
        return cantMaxKg;
    }

    public void setCantMaxKg(Integer cantMaxKg) {
        this.cantMaxKg = cantMaxKg;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double actualizarValorPrecio(Double aumento) {
        return precio * aumento;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "tipoVehiculo=" + tipoVehiculo +
                ", nombreModelo='" + nombreModelo + '\'' +
                ", precio=" + precio +
                ", cantMaxKg=" + cantMaxKg +
                ", altura=" + altura +
                "} ";
    }
}
