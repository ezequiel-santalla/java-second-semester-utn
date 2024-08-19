package model;

public class Employee {
    private String dni;
    private String name;
    private String lastName;
    private Float salary;

    public Employee(String dni, String name, String lastName, Float salary) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[dni=" + getDni() + ", name=" + getName() + ", lastName=" + getLastName() + ", salary=" + getSalary() + "]";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
