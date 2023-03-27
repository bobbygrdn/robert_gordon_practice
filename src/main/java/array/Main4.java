package array;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
        System.out.println(numbers[numbers.length]);

        numbers[5] = 10;
    }
}
