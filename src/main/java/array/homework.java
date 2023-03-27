package array;

import java.util.HashMap;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Read a line of text such as “I love Java. You love Java. She loves Java.”
        // Split them into words
        // Count number of times each word (excluding dot .) occurs
        // So the end result is something like following:
        // "I" occurs once
        // "love" occurs twice
        // "Java" occurs 3 times
        // "You" occurs once
        // "She" occurs once
        // "loves" occurs once

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a line of text: ");
            String line = scan.nextLine();
            System.out.println();

            String[] words = line.replace(".", "").split(" ");

            HashMap<String, Integer> map = findOccurances(words);

            printOccurances(map);

        }

    }

    private static HashMap<String, Integer> findOccurances(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    private static void printOccurances(HashMap<String, Integer> map) {
        for (String word : map.keySet()) {
            switch (map.get(word)) {
                case 1:
                    System.out.println(word + " occurs once");
                    break;
                case 2:
                    System.out.println(word + " occurs twice");
                    break;
                default:
                    System.out.println(word + " occurs " + map.get(word) + " times");
            }
        }
    }
}
