package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private ArrayList<Double> monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate,
            ArrayList<Double> monthlySales) {
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

    public String getEmployeeInfo() {
        return super.getName() + " who was hired on " + super.getHireDate() + " made $" + computeMonthlyCompensation()
                + " on commission this month.";
    }
}
