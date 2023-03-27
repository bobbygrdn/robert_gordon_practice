package array;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        int[] numbers = { 4, 2, 9, 13, 1 };

        Arrays.sort(numbers);

        System.out.printf("Smallest number is %s\n", numbers[0]);
        System.out.printf("Largest Number is %s\n", numbers[numbers.length - 1]);
    }
}
