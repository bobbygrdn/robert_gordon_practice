package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");

            Scanner scanner = new Scanner(file);
            System.out.println("----------- Testing reading sample.txt -----");
            System.out.printf("%-20s%-20s%-10s%-10s\n", "Name", "Description", "Price", "Quantity");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("  ");

                System.out.printf("%-20s%-20s%-10.2f%-10d",
                        words[0], words[1], Double.parseDouble(words[2]), Integer.parseInt(words[3]));
                System.out.println();

            }
            System.out.println();
            scanner.close();
        } catch (FileNotFoundException e) {
        }

        Item item1 = new Item("Coffee", "Iced Coffee", 1.00, 10);
        System.out.println("----------- Testing the constructor of Item class -----");
        System.out.printf("%-20s%-20s%-10.2f%-10d%-10d\n", item1.getItemName(), item1.getItemDescription(),
                item1.getPrice(),
                item1.getQuantity(), item1.getAvailableQuantity());

        System.out.println("----------- Testing the constructor of MySystem class -----");
        MySystem newSystem = new MySystem();

        newSystem.printCurrentItems();

        System.out.println("----------- Testing the addItem(...) method of MySystem class -----");

        System.out.printf("size before adding a new item = %d\n", newSystem.getMyItemsInHashMap().size());

        newSystem.addItem(new Item("coffee", "coffee", 3.00, 10));

        System.out.printf("size after adding a new item = %d\n", newSystem.getMyItemsInHashMap().size());

        newSystem.printCurrentItems();

        newSystem.addItem(new Item("salad", "cobb salad", 15.5, 12));

        System.out.printf("size after adding a existing item = %d\n", newSystem.getMyItemsInHashMap().size());

        System.out.println("----------- Testing the removeItem(...) method of MySystem class -----");
        newSystem.removeItem("pizza");
        System.out.printf("size after removing an item = %d\n", newSystem.getMyItemsInHashMap().size());

        newSystem.printCurrentItems();

        System.out.println("----------- Testing reduceAvailableQuantity(..) method -----");
        Integer coffeeAvailableQuantity = newSystem.getMyItemsInHashMap().get("coffee").getAvailableQuantity();
        System.out.println("coffee available quantity before purchase = " + coffeeAvailableQuantity);
        newSystem.reduceAvailableQuantity("coffee");
        coffeeAvailableQuantity = newSystem.getMyItemsInHashMap().get("coffee").getAvailableQuantity();
        System.out.println("coffee available quantity after purchase = " + coffeeAvailableQuantity);

    }
}
