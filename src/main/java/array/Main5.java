package array;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
