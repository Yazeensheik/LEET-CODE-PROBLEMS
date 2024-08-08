package oops_inheritance;

public class Calculator {

    // Static method to calculate power for integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method to calculate power for double
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        // Testing the functionalities

        // Testing powerInt method
        int resultInt = Calculator.powerInt(2, 3);
        System.out.println("2 to the power of 3 is: " + resultInt); // Output should be 8

        // Testing powerDouble method
        double resultDouble = Calculator.powerDouble(2.5, 3);
        System.out.println("2.5 to the power of 3 is: " + resultDouble); // Output should be 15.625
    }
}