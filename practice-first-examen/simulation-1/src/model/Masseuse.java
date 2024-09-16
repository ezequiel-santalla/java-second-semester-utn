package model;

import java.util.UUID;

public class Masseuse extends Member {
    private String titulo;
    private Integer yearsOfExperience;

    public Masseuse(UUID ID, String name, String lastName, Integer age) {
        super(ID, name, lastName, age);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Masseuse{" +
                "titulo='" + titulo + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                "} " + super.toString();
    }
}
