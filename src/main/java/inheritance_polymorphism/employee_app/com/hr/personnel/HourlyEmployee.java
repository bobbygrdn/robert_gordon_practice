package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    public double computeMonthlyTaxToPay() {
        return hourlyRate * hoursWorkedPerMonth * HOURLY_TAX_RATE;
    }

    public String getEmployeeInfo() {
        return super.getName() + " who was hired on " + super.getHireDate() + " worked for " + hoursWorkedPerMonth
                + " hours this month with an hourly rate of $" + hourlyRate + " per hour, made $"
                + computeMonthlyCompensation();
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
