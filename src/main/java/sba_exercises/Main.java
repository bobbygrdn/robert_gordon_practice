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

                System.out.printf("item Name %s\nitem Description %s\nitem Price %s\nitem AvailableQuantity %s\n",
                        words[0], words[1], words[2], words[3]);
                System.out.println();

            }
            scanner.close();
            System.out.println("----------------\n");
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
