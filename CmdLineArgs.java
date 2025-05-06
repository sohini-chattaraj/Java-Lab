//Lab Ques2

import java.util.Scanner;

public class CmdLineArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            
            try {
                numbers[i] = scanner.nextInt();

                if (numbers[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                // Clear the input buffer
                scanner.next();
                i--; // Retry the current iteration
            }
        }

        // Print the counts and corresponding numbers
        System.out.println("\nEven numbers count: " + evenCount);
        System.out.print("Even numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nOdd numbers count: " + oddCount);
        System.out.print("Odd numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}