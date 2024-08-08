package oops_inheritance;

import java.util.Scanner;

public class StringConcatenator {

    // Method to concatenate two strings, convert to lowercase, and remove consecutive duplicates
    public static String concatenateAndRemoveDuplicates(String str1, String str2) {
        // Concatenate the two strings and convert to lowercase
        String concatenatedString = (str1 + str2).toLowerCase();
        
        // Remove consecutive duplicate characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < concatenatedString.length(); i++) {
            if (i == 0 || concatenatedString.charAt(i) != concatenatedString.charAt(i - 1)) {
                result.append(concatenatedString.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Concatenate the strings, convert to lowercase, and remove consecutive duplicates
        String result = concatenateAndRemoveDuplicates(string1, string2);

        // Print the result
        System.out.println("The result after concatenation and removing duplicates is: " + result);

        scanner.close();
    }
}