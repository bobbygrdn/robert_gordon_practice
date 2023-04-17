package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapRefactor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: "); // Get user input
            String text = sc.nextLine();

            String[] words = text.replaceAll("[^a-zA-z0-9]+", " ").split(" "); // split text into words

            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String string : words) {
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, 1);
                } else {
                    hashMap.put(string, hashMap.get(string) + 1);
                }
            }

            printOccurances(hashMap);
        }
    }

    private static void printOccurances(HashMap<String, Integer> hashMap) {
        for (String string : hashMap.keySet()) {
            if (hashMap.get(string) == 1) {
                System.out.printf("\"%s\" occurs once\n", string);
            } else if (hashMap.get(string) == 2) {
                System.out.printf("\"%s\" occurs twice\n", string);
            } else {
                System.out.printf("\"%s\" occurs %d times\n", string, hashMap.get(string));
            }
        }
    }

}
