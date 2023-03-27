package array;

public class Main7 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length / 2) {
                continue;
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}
