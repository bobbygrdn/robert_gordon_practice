package array;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String[] words = text.replace(".", "").split(" "); // split text into words

            String[] uniqueWords = getUniqueWords(words); // get unique words

            int[] counts = getCounts(uniqueWords, words); // get word counts

            printOccurances(uniqueWords, counts); // print results

        }
    }

    // helper method to get unique words
    private static String[] getUniqueWords(String[] words) {
        String[] uniqueWords = new String[words.length];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!isWordInArray(words[i], uniqueWords)) {
                uniqueWords[count] = words[i];
                count++;
            }
        }
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = uniqueWords[i];
        }
        return result;
    }

    // helper method to check if a word is in an array
    private static boolean isWordInArray(String word, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    // helper method to get counts
    private static int[] getCounts(String[] uniqueWords, String[] words) {
        int[] counts = new int[uniqueWords.length];

        for (int i = 0; i < uniqueWords.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (uniqueWords[i].equals(words[j])) {
                    counts[i]++;
                }
            }
        }
        return counts;
    }

    // helper method to print results
    private static void printOccurances(String[] uniqueWords, int[] counts) {
        for (int i = 0; i < uniqueWords.length; i++) {
            if (counts[i] == 1) {
                System.out.printf("\"%s\" occurs once\n", uniqueWords[i]);
            } else if (counts[i] == 2) {
                System.out.printf("\"%s\" occurs twice\n", uniqueWords[i]);
            } else {
                System.out.printf("\"%s\" occurs %d times\n", uniqueWords[i], counts[i]);
            }
        }
    }
}
