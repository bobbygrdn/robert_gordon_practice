package array;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
