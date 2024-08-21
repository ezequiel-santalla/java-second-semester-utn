import model.employee.EmployeeContractor;
import model.employee.EmployeeFullTime;
import model.employee.EmployeePerHour;

public class Main {
    public static void main(String[] args) {
        EmployeeFullTime empFullTime = new EmployeeFullTime("Ezequiel", 1000000F);
        EmployeePerHour empPerHour = new EmployeePerHour("Rodrigo", 25, 5000);
        EmployeeContractor empContractor = new EmployeeContractor("Jere", 40, 8000, 3);

        System.out.println();
        System.out.println(empFullTime);
        System.out.println(empPerHour);
        System.out.println(empContractor);
    }
}