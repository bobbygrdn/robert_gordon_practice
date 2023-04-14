package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee.work().equals("worked")) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;
    }

    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0.0;
        for (Employee employee : employees) {
            if (employee.work().equals("worked")) {
                totalCompensation += employee.computeMonthlyCompensation();
            }
        }
        return totalCompensation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
