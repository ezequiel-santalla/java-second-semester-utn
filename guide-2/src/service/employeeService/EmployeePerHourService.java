package service.employeeService;

import model.employee.Employee;

public class EmployeePerHourService extends EmployeeService {

    @Override
    public float calculatePayment(Employee emp) {
        return emp.getSalary();
    }
}
