package model.employee;

public class EmployeeContractor extends Employee {
    protected int workedHours;
    protected float projectFee;
    protected int numberOfProjects;

    public EmployeeContractor(String name, int workedHours, float projectFee, int numberOfProjects) {
        super(name, workedHours * projectFee * numberOfProjects);
        this.workedHours = workedHours;
        this.projectFee = projectFee;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public String toString() {
        return "EmployeeContractor{" +
                "name='" + name + '\'' +
                ", workedHours=" + workedHours +
                ", projectFee=" + projectFee +
                ", numberOfProjects=" + numberOfProjects +
                ", salary=" + salary +
                '}';
    }
}
