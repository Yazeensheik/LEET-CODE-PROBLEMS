package oops_inheritance;

import java.util.Scanner;

public class AlternateMerge {

    // Method to combine two strings as described
    public static String mergeAlternately(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        
        // Merge characters alternately
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        
        // Append remaining characters from the longer string
        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
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

        // Get the combined result
        String result = mergeAlternately(string1, string2);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}