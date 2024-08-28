package model.university;

public class Person {
    private String dni;
    private String name;
    private String lastName;
    private String email;
    private String address;

    public Person() {
    }

    public Person(String dni, String name, String lastName, String email, String address) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
