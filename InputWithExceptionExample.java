import java.util.Scanner;
import java.util.InputMismatchException;

public class InputWithExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter an integer: ");

                if (scanner.hasNextInt()) {
                    int userInput = scanner.nextInt();
                    System.out.println("You entered: " + userInput);
                    break; // Exit the loop if an integer is entered
                } else {
                    // Consume the invalid input (clear the scanner buffer)
                    scanner.next();
                    System.out.println("Invalid input. Please enter an integer.");
                }
            } catch (InputMismatchException e) {
                // Handle the InputMismatchException
                System.out.println("InputMismatchException: " + e.getMessage());
                System.out.println("Enter a valid number.");
                // Consume the invalid input (clear the scanner buffer)
                scanner.next();
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
