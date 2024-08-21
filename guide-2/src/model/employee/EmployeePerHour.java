package model.employee;

public class EmployeePerHour extends Employee {
    protected int workedHours;
    protected float hourlyRate;

    public EmployeePerHour(String name, int workedHours, float hourlyRate) {
        super(name, workedHours * hourlyRate);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "EmployeePerHour{" +
                "name='" + name + '\'' +
                ", workedHours=" + workedHours +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                '}';
    }
}
