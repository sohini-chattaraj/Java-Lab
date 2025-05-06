import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Change the case of the string
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();
        System.out.println("The string after changing the case is: " + inputString.toUpperCase());

        // Reverse the string
        System.out.println("The string after reversing is: " + new StringBuilder(inputString).reverse().toString());

        // Compare two strings
        System.out.print("Enter the second string for comparison: ");
        String string2 = scanner.nextLine();
        int asciiDiff = 0;
        for (int i = 0; i < inputString.length() && i < string2.length(); i++) {
            asciiDiff += Math.abs((int) inputString.charAt(i) - (int) string2.charAt(i));
        }
        System.out.println("The difference between ASCII value is " + asciiDiff);

        // Insert one string into another string
        System.out.print("Enter the string to be inserted into the first string: ");
        String insertString = scanner.nextLine();
        System.out.println("The string after insertion is: " + inputString + " " + insertString);

        // Convert the string to uppercase and lowercase
        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        // Check whether the character is present in the string and at which position
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        if (inputString.contains(String.valueOf(character))) {
            System.out.println("Position of entered character: " + inputString.indexOf(character));
        } else {
            System.out.println("Entered character is not present");
        }

        // Check whether the string is palindrome or not
        if (inputString.equals(new StringBuilder(inputString).reverse().toString())) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

        // Check the number of word, vowel, and consonant in the string
        int wordCount = inputString.split("\\s+").length;
        int vowelCount = 0;
        for (char c : inputString.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        int consonantCount = inputString.replaceAll("\\s+", "").length() - vowelCount;
        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);
    }
}
