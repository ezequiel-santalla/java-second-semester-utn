package model;

import java.time.LocalDate;

public class Federation {
    private String name;
    private LocalDate foundationDate;
    private Integer worldCupTitles;

    public Federation(String name, LocalDate foundationDate, Integer worldCupTitles) {
        this.name = name;
        this.foundationDate = foundationDate;
        this.worldCupTitles = worldCupTitles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Integer getWorldCupTitles() {
        return worldCupTitles;
    }

    public void setWorldCupTitles(Integer worldCupTitles) {
        this.worldCupTitles = worldCupTitles;
    }

    @Override
    public String toString() {
        return "Federation{" +
                "name='" + name + '\'' +
                ", foundationDate=" + foundationDate +
                ", worldCupTitles=" + worldCupTitles +
                '}';
    }
}
