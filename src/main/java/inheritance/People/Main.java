package inheritance.People;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 20);
        student1.setPersonPosition("Student");

        String studentIntroduction = student1.sayHello();
        System.out.println(studentIntroduction);
    }
}
