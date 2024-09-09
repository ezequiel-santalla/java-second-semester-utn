package model;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private String dni;
    private String gender;
    private Double weight;
    private Double height;

    public Person(String dni) {
        this.name = "";
        this.age = 0;
        this.dni = dni;
        this.gender = "Masculine";
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Person(String name, Integer age, String gender, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.dni = "";
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
