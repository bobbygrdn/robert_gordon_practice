package inheritance_polymorphism.people;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String position;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String sayHello() {
        return "Hello, my name is " + firstName + " " + lastName + " and I am " + age + " years old.";
    }

    public void setPersonPosition(String position) {
        this.position = position;
    }

    public String getPersonPosition() {
        return position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
