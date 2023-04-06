package inheritance.People;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 20);
        student.setPersonPosition("Student");

        System.out.println(student.sayHello());
    }
}
