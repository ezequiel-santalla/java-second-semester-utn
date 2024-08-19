package service;

import model.Employee;

public class EmployeeService {
    public Float calculateYearlySalary(Employee emp) {
        float yearlySalary;

        yearlySalary = emp.getSalary() * 12;

        return yearlySalary;
    }

    public Float raiseSalary(Float percentageChange, Float yearlySalary) {
        float salaryAfterRaise;

        salaryAfterRaise = yearlySalary + yearlySalary * percentageChange;

        return salaryAfterRaise;
    }
}
