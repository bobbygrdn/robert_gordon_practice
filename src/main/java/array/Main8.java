package array;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        String[] names = { "John", "Jane", "Jack", "Jill", "Jenny" };

        String temp = names[names.length / 2];
        names[names.length / 2] = names[0];
        names[0] = temp;

        System.out.println(Arrays.toString(names));

    }
}
