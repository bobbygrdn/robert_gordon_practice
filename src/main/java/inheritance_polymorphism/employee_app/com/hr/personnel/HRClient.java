package inheritance_polymorphism.employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Department department = new Department("I.T.", "Sunnyvale, California");

        SalariedEmployee employee1 = new SalariedEmployee("John", LocalDate.of(2022, 10, 25), 5000.0);
        SalariedEmployee employee2 = new SalariedEmployee("Mary", LocalDate.of(2023, 02, 10), 6000.0);
        HourlyEmployee employee3 = new HourlyEmployee("Charles", LocalDate.of(2021, 07, 18), 8, 2000.0);

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        String employee1Info = employee1.getEmployeeInfo();
        String employee2Info = employee2.getEmployeeInfo();
        String employee3Info = employee3.getEmployeeInfo();

        System.out.println(employee1Info);
        System.out.println(employee2Info);
        System.out.println(employee3Info);

        int employee1Tenure = employee1.computeNumberOfYearsWorkedSinceHired();
        int employee2Tenure = employee2.computeNumberOfYearsWorkedSinceHired();
        int employee3Tenure = employee3.computeNumberOfYearsWorkedSinceHired();

        System.out.printf("%s has been working for our company for %d years.\n", employee1.getName(), employee1Tenure);
        System.out.printf("%s has been working for our company for %d years.\n", employee2.getName(), employee2Tenure);
        System.out.printf("%s has been working for our company for %d years.\n", employee3.getName(), employee3Tenure);

        int departmentInfo = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.printf("We have %d employees working in the %s department at our %s location.\n", departmentInfo,
                department.getName(), department.getLocation());
    }
}
