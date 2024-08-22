package model.sale;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private Float discountPercentage;

    public Client(UUID id, String name, String email, Float discountPercentage) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.discountPercentage = discountPercentage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
