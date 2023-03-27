package array;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] colors = { "red", "green", "blue", "yellow" };

        System.out.println(colors.length);

        String[] colors2 = colors.clone();
        System.out.println(Arrays.toString(colors2));
    }

}
