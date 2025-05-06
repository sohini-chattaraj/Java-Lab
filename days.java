import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a valid day number
        System.out.print("Enter a day number of the current month (1-7): ");
        int dayNumber = scanner.nextInt();

        // Validate the input
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            // Print the corresponding weekday using switch...case
            String weekday;
            switch (dayNumber) {
                case 1:
                    weekday = "Sunday";
                    break;
                case 2:
                    weekday = "Monday";
                    break;
                case 3:
                    weekday = "Tuesday";
                    break;
                case 4:
                    weekday = "Wednesday";
                    break;
                case 5:
                    weekday = "Thursday";
                    break;
                case 6:
                    weekday = "Friday";
                    break;
                case 7:
                    weekday = "Saturday";
                    break;
                default:
                    weekday = "Invalid day";
                    break;
            }

            System.out.println("The corresponding weekday is: " + weekday);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}