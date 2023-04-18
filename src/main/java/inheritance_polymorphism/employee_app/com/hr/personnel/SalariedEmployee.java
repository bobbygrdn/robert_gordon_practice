package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    public double computeMonthlyTaxToPay() {
        double monthlyTax = monthlySalary * SALARIED_TAX_RATE - DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION;

        if (monthlyTax <= DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION) {
            return 0.0;
        } else {
            return monthlyTax;
        }
    }

    public String getEmployeeInfo() {
        return super.getName() + " who was hired on " + super.getHireDate() + " earned $" + getMonthlySalary()
                + " this month.";
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
