public class MathOperation {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please enter exactly 5 integers as command line arguments.");
            return;
        }

        int[] numbers = new int[5];
        int sum = 0;

        try {
            // Parse command line arguments and store them in the array
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            // Calculate the average
            double average = (double) sum / numbers.length;

            // Display the sum and average
            System.out.println("Sum of all elements: " + sum);
            System.out.println("Average of all elements: " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please ensure all arguments are integers.");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: Arithmetic error occurred.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
