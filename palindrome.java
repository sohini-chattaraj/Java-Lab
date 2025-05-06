import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

       
        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome successfully detected");
        } else {
            System.out.println("The input number is not a palindrome");
        }

        
    }
}