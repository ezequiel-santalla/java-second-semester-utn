package model;

import java.util.UUID;

public class FieldAssistant extends Member {
    private String methodology;

    public FieldAssistant(UUID ID, String name, String lastName, Integer age) {
        super(ID, name, lastName, age);
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    @Override
    public String toString() {
        return "FieldAssistant{" +
                "methodology='" + methodology + '\'' +
                "} " + super.toString();
    }
}
