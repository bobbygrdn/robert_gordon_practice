package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double[] monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate, double[] monthlySales) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
    }

    public double computeMonthlyCompensation() {
        double result = 0.0;
        for (double sale : monthlySales) {
            result += sale;
        }
        return commissionRate * result;
    }
}
