package inheritance.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
