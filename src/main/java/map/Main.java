package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Item> itemsList = new HashMap<>();

        itemsList.put("TV", new Item("TV", "Roku TV", 500.0, 10));
        itemsList.put("Laptop", new Item("Laptop", "Thinkpad Laptop X1", 600.0, 10));

        int listSize = itemsList.size();
        System.out.println("List size: " + listSize);

        Item tv = itemsList.get("TV");
        System.out.printf("\tName: %s\n \tDescription: %s\n \tPrice: $%.2f\n \tQuantity Available: %d\n",
                tv.getName(),
                tv.getDescription(), tv.getPrice(),
                tv.getAvailableQuantity());

        itemsList.remove("TV");

        listSize = itemsList.size();
        System.out.println("List size: " + listSize);

        Collection<String> listKeys = itemsList.keySet();
        System.out.println("Keys: ");

        for (String string : listKeys) {
            System.out.printf("%s\n", string);
        }

        Collection<Item> listValues = itemsList.values();
        System.out.println("Values: ");

        for (Item item : listValues) {
            System.out.printf("\tName: %s\n \tDescription: %s\n \tPrice: $%.2f\n \tQuantity Available: %d\n",
                    item.getName(),
                    item.getDescription(), item.getPrice(),
                    item.getAvailableQuantity());
        }
    }
}
