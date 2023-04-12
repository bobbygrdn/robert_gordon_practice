package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract String getEmployeeInfo();

    public String work() {
        return name + " worked.";
    }

    public int computeNumberOfYearsWorkedSinceHired() {
        int years = 0;
        LocalDate currentDate = LocalDate.now();
        years = currentDate.getYear() - hireDate.getYear();
        return years;
    }

    public abstract double computeMonthlyCompensation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

}
