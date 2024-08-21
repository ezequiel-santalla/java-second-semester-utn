package model.employee;

public class EmployeeFullTime extends Employee {
    public EmployeeFullTime(String name, float salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
