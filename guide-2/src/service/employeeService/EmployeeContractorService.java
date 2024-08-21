package service.employeeService;

import model.employee.Employee;

public class EmployeeContractorService extends EmployeeService {

    @Override
    public float calculatePayment(Employee emp) {
        return emp.getSalary();
    }
}
