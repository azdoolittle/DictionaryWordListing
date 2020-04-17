/*
Pseudocode:
import scanner
import Arrays

declare class
declare main method
declare method to print original list
declare method to print ascending order method
declare method to print descending method
declare vars for words 1-10
declare scanner

initialize methods

prompt user to enter 10 words
initialize each array index as input word

prompt user to use a method


 */
import java.util.Scanner;
import java.util.Arrays;

public class DictionaryWordListing {
        public static void main(String[] args) {
            int userInput;
            String[] tenWords = new String[10];
            Scanner inputWord = new Scanner(System.in);
            System.out.println("Let's make a dictionary! Give me 10 words.");
            System.out.println("Enter a word (1/10): ");
            tenWords[0] = inputWord.nextLine();

            for (int i = 1; i < 10; i += 1) {
                System.out.printf("Enter a word (%d/10): ", i + 1);
                tenWords[i] = inputWord.nextLine();
            }
//            inputWord.nextLine();


            System.out.println("How would you like to view your dictionary?\n" +
                    "Enter '0' to quit.\n" +
                    "Enter '1' for Original Order.\n" +
                    "Enter '2' for Alphabetical Order.\n" +
                    "Enter '3' for Reversed Alphabetical Order.");
            userInput = inputWord.nextInt();

            switch (userInput) {
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Here is your dictionary in Original Order: ");
                    original(tenWords);
                    break;
                case 2:
                    System.out.println("Here is your dictionary in Alphabetical Order: ");
                    bubbleSort(tenWords, "abc");
                    break;
                case 3:
                    System.out.println("Here is your dictionary in Reversed Alphabetical Order: ");
                    bubbleSort(tenWords, "zyx");
                    break;
        }


    }
    public static void original(String[] list) {
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSort(String[] list, String order) {
        String temp;
        int length = list.length;
        String nextWord, thisWord;

        for (int i = 0; i < list.length - 1; i++) {
            for (int k= 0; k < list.length - i - 1; k++) {
                nextWord = list[k + 1];
                thisWord = list[k];
                if (order.equals("abc")) {
                    if (nextWord.compareTo(thisWord) < 0) {
                        temp = thisWord;
                        list[k] = nextWord;
                        list[k + 1] = temp;
                    }
                } else {
                    if (thisWord.compareTo(nextWord) < 0) {
                        temp = nextWord;
                        list[k] = thisWord;
                        list[k + 1] = temp;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(list));
    }


}
