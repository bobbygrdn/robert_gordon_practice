package inheritance.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private int monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate, int monthlySales) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
    }

    public double computeMonthlyCompensation() {
        return commissionRate * monthlySales;
    }
}
