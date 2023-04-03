package class_practice.student;

public class Main {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord("Charles", 90.5);

        student1.setScienceScore(80.2);
        student1.setAlgebraScore(70.1);

        StudentRecord student2 = new StudentRecord("Michael", 80.9, 60.9, 75.8);

        System.out.println(StudentRecord.getStudentCount());

        student1.print(student1.getName());
        student1.print(student1.getAverageScore());
        student2.print(student2.getName(), student2.getAverageScore());
    }
}
