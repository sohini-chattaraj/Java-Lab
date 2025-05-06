/*Write a program in java using constructor overloading concept to calculate the
area of a rectangle having data members as length and breadth. Use default
constructor to initialize the value of the data member to zero and parameterized
constructor to initialize the value of data member according to the user input.
Input: Mention the value of length and breadth
Output: Display the area of the rectangle accordingly*/
import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    // Default constructor
    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of Rectangle with default values: " + rectangle1.calculateArea());

        // Using parameterized constructor with user input
        System.out.print("Enter length of the rectangle: ");
        double userLength = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double userBreadth = scanner.nextDouble();

        Rectangle rectangle2 = new Rectangle(userLength, userBreadth);
        System.out.println("Area of Rectangle with user input: " + rectangle2.calculateArea())
    }
}