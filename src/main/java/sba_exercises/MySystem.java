package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem {
    private Map<String, Item> myItemsInHashMap;

    public MySystem() {
        this.myItemsInHashMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("sample.txt"));
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split("  ");
                Item item = new Item(data[0], data[1], Double.parseDouble(data[2]), Integer.parseInt(data[3]));
                myItemsInHashMap.put(data[0], item);
            }
        } catch (FileNotFoundException e) {
        }
    }

    public void printCurrentItems() {
        for (String item : myItemsInHashMap.keySet()) {
            Item elemenItem = myItemsInHashMap.get(item);
            System.out.printf("%-20s%-20s%-10.2f%-10d\n", elemenItem.getItemName(),
                    elemenItem.getItemDescription(),
                    elemenItem.getPrice(), elemenItem.getAvailableQuantity());
        }
        System.out.println();
    }

    public Item addItem(Item item) {
        if (!myItemsInHashMap.containsKey(item.getItemName())) {
            myItemsInHashMap.put(item.getItemName(), item);
            return item;
        }
        return null;
    }

    public Item removeItem(String itemName) {
        if (myItemsInHashMap.containsKey(itemName)) {
            myItemsInHashMap.remove(itemName);
            return myItemsInHashMap.get(itemName);
        }
        return null;
    }

    public Item reduceAvailableQuantity(String string) {
        if (myItemsInHashMap.containsKey(string)) {
            Item item = myItemsInHashMap.get(string);
            item.setAvailableQuantity(item.getAvailableQuantity() - 1);
            if (item.getAvailableQuantity() == 0) {
                myItemsInHashMap.remove(string);
            }
            return item;
        } else {
            return null;
        }
    }

    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }

}
