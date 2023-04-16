package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("  ");

                System.out.printf("%-20s\n %-20s\n %-20.2f\n %d\n",
                        words[0], words[1], parseDouble(words[2]), parseInt(words[3]));
                System.out.println();

            }
            scanner.close();
        } catch (FileNotFoundException e) {
        }

        MySystem newSystem = new MySystem();

        newSystem.printCurrentItems();

        newSystem.printCurrentLength();

        newSystem.addItem(new Item("Coffee", "Coffee", 1.00, 10));

        newSystem.printCurrentLength();

        newSystem.printCurrentItems();

        newSystem.addItem(new Item("salad", "cobb salad", 15.5, 12));

        newSystem.printCurrentLength();

    }
}
