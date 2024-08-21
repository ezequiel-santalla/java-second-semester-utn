package service.employeeService;

import model.employee.Employee;

public abstract class EmployeeService {
    public EmployeeService() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract float calculatePayment(Employee emp);
}
