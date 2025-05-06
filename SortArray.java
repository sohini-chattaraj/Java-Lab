import java.util.Arrays;
import java.util.Scanner;

public class SortArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Ask the user to input the array's contents
        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            
            try {
                array[i] = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                // Clear the input buffer
                scanner.next();
                i--; // Retry the current iteration
            }
        }

        // Sort the array
        Arrays.sort(array);

        // Output the sorted array
        System.out.println("\nSorted Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
