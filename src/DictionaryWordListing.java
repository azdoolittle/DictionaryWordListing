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
    String[] tenWords = new String[10];
    Scanner inputWord = new Scanner(System.in);

    public void main(String[] args) {
        System.out.println("Let's make a dictionary! Give me 10 words.");
        for (int i = 0; i < 10; i += 1) {
            System.out.printf("Enter a word (%d/10): ", i);
            tenWords[i] = inputWord.next();
        }
        System.out.println("How would you like to view your dictionary?\n" +
                "Enter '1' for Original Order\n" +
                "Enter '2' for Alphabetical Order\n" +
                "Enter '3' for Reversed Alphabetical Order\n");
    }
}
