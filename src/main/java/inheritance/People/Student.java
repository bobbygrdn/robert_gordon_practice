package inheritance.People;

public class Student extends Person {
    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String sayHello() {
        return "Hello, my name is " + getFirstName() + " " + getLastName() + ", I am " + getAge()
                + " years old and I am a " + getPersonPosition() + ".";
    }
}
