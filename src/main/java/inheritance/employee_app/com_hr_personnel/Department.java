package inheritance.employee_app.com_hr_personnel;

public class Department {
    String name;
    String location;
    Employee[] employees = new Employee[100];
    int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        this.employees[currentIndex] = employee;
        currentIndex++;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;
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

}
