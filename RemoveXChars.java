package oops_inheritance;

import java.util.Scanner;

public class RemoveXChars {

    // Method to remove 'x' from the start and/or end of the string
    public static String removeX(String str) {
        int length = str.length();

        // Check if the first character is 'x'
        if (length > 0 && str.charAt(0) == 'x') {
            // Remove the first 'x'
            str = str.substring(1);
        }

        // Check if the last character is 'x'
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            // Remove the last 'x'
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Process the string and get the result
        String result = removeX(input);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}