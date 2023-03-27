package array;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("How many favorite things do you have?");
            int items = scan.nextInt();

            String[] favoriteThings = new String[items];

            for (int i = 0; i < items; i++) {
                System.out.println("Enter your thing: ");
                favoriteThings[i] = scan.next();
            }
            System.out.println("Your favorite things are: ");

            String result = "";

            for (int i = 0; i < items; i++) {
                result += favoriteThings[i] + " ";
            }

            System.out.println(result);
        }

    }
}
