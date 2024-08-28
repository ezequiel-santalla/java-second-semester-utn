package model.university;

public class Staff extends Person {
    private Double salary;
    private String time;

    public Staff() {
    }

    public Staff(String dni, String name, String lastName, String email, String address, Double salary, String time) {
        super(dni, name, lastName, email, address);
        this.salary = salary;
        this.time = time;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                ", salary=" + salary +
                ", time='" + time + '\'' +
                "} ";
    }
}
