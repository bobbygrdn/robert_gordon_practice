package array;

import java.util.HashMap;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
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
                    System.out.printf("\"%s\" occurs once\n", word);
                    break;
                case 2:
                    System.out.printf("\"%s\" occurs twice\n", word);
                    break;
                default:
                    System.out.printf("\"%s\" occurs %s times\n", word, map.get(word));
            }
        }
    }
}
