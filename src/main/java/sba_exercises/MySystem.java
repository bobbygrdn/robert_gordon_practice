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
        for (String key : myItemsInHashMap.keySet()) {
            Item item = myItemsInHashMap.get(key);
            System.out.println(item.toString());
            System.out.println();
        }
    }

    public void printCurrentLength() {
        System.out.println("The current number of the items you have is: " + myItemsInHashMap.keySet().size());
        System.out.println();
    }

    public Item addItem(Item item) {
        if (!myItemsInHashMap.containsKey(item.getItemName())) {
            myItemsInHashMap.put(item.getItemName(), item);
            return item;
        }
        System.out.printf("%s is already present. Cannot be added.\n\n", item.getItemName());
        return null;
    }

    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }

}
