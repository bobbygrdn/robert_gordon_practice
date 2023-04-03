package class_practice.student;

public class StudentRecord {
    private static int studentCount;
    private String name;
    private double mathScore;
    private double scienceScore;
    private double algebraScore;

    public StudentRecord() {
        studentCount++;
    }

    public StudentRecord(String name) {
        this.name = name;
        studentCount++;
    }

    public StudentRecord(String name, double averageScore) {
        this(name);
        this.mathScore = averageScore;
        studentCount++;
    }

    public StudentRecord(String name, double mathScore, double scienceScore, double algebraScore) {
        this(name, mathScore);
        this.scienceScore = scienceScore;
        this.algebraScore = algebraScore;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        StudentRecord.studentCount = studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(double scienceScore) {
        this.scienceScore = scienceScore;
    }

    public double getAlgebraScore() {
        return algebraScore;
    }

    public void setAlgebraScore(double algebraScore) {
        this.algebraScore = algebraScore;
    }

    public double getAverageScore() {
        return (mathScore + scienceScore + algebraScore) / 3;
    }

    public void print(String name) {
        System.out.println(name);
    }

    public void print(String name, double averageScore) {
        System.out.println(name + " " + averageScore);
    }

    public void print(double averageScore) {
        System.out.println(averageScore);
    }
}
