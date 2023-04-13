package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Department department = new Department("I.T.", "Sunnyvale, California");

        SalariedEmployee employee1 = new SalariedEmployee("John", LocalDate.of(2022, 10, 25), 7000.0);
        SalariedEmployee employee2 = new SalariedEmployee("Mary", LocalDate.of(2023, 02, 10), 8000.0);
        HourlyEmployee employee3 = new HourlyEmployee("Charles", LocalDate.of(2021, 07, 18), 120, 45.0);
        CommissionedEmployee employee4 = new CommissionedEmployee("Michael", LocalDate.of(2022, 06, 13), 0.5,
                new double[] { 5000.0, 6000.0 });

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        department.addEmployee(employee4);

        String employee1Info = employee1.getEmployeeInfo();
        String employee2Info = employee2.getEmployeeInfo();
        String employee3Info = employee3.getEmployeeInfo();
        String employee4Info = employee4.getEmployeeInfo();

        System.out.println(employee1Info);
        System.out.println(employee2Info);
        System.out.println(employee3Info);
        System.out.println(employee4Info);

        int employee1Tenure = employee1.computeNumberOfYearsWorkedSinceHired();
        int employee2Tenure = employee2.computeNumberOfYearsWorkedSinceHired();
        int employee3Tenure = employee3.computeNumberOfYearsWorkedSinceHired();
        int employee4Tenure = employee4.computeNumberOfYearsWorkedSinceHired();

        System.out.println();
        System.out.printf("%s has been working for our company for %d %s.\n", employee1.getName(), employee1Tenure,
                employee1Tenure == 1 ? "year" : "years");
        System.out.printf("%s has been working for our company for %d %s.\n", employee2.getName(), employee2Tenure,
                employee2Tenure == 1 ? "year" : "years");
        System.out.printf("%s has been working for our company for %d %s.\n", employee3.getName(), employee3Tenure,
                employee3Tenure == 1 ? "year" : "years");
        System.out.printf("%s has been working for our company for %d %s.\n", employee4.getName(), employee4Tenure,
                employee4Tenure == 1 ? "year" : "years");

        System.out.println();
        int departmentInfo = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.printf("We have %d employees working in the %s department at our %s location.\n", departmentInfo,
                department.getName(), department.getLocation());
        System.out.printf("The %s department employees have a total monthly compensation of $%.2f.\n",
                department.getName(),
                department.computeDepartmentMonthlyTotalCompensation());
    }
}
