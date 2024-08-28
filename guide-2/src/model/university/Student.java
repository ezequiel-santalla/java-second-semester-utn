package model.university;

import java.time.LocalDate;

public class Student extends Person {
    private LocalDate startDate;
    private Double monthlyFee;
    private String career;

    public Student() {
    }

    public Student(String dni, String name, String lastName, String email, String address, LocalDate startDate, Double monthlyFee, String career) {
        super(dni, name, lastName, email, address);
        this.startDate = startDate;
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", startDate=" + startDate +
                ", monthlyFee=" + monthlyFee +
                ", career='" + career + '\'' +
                "} ";
    }
}
