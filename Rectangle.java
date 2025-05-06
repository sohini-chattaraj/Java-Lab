/*Write a program in Java to define a class Rectangle having data members:
length & breadth, and three methods called read(), calculate() and display() to
read the values of length & breadth, calculate the area and perimeter of the
rectangle and display the result respectively. Finally, create two objects of the
Rectangle class, ask and input the respective dimensions (length,breadth) from
the user, and then calculate and display their respective areas and perimeters.
Input: Mention length and breadth
Output: Display Area of Rectangle and Perimeter of rectangle.
*/
import java.util.Scanner;

class Main {
    // Data members
    double length;
    double breadth;

    // Method to read values of length and breadth
    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display the result
    void display(double area, double perimeter) {
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        // Create two objects of Rectangle class
        Main rectangle1 = new Main();
        Main rectangle2 = new Main();

        // Read values for the first rectangle
        System.out.println("Enter dimensions for the first rectangle:");
        rectangle1.read();

        // Calculate area and perimeter for the first rectangle
        double area1 = rectangle1.calculateArea();
        double perimeter1 = rectangle1.calculatePerimeter();

        // Display the results for the first rectangle
        System.out.println("Results for the first rectangle:");
        rectangle1.display(area1, perimeter1);

        // Read values for the second rectangle
        System.out.println("\nEnter dimensions for the second rectangle:");
        rectangle2.read();

        // Calculate area and perimeter for the second rectangle
        double area2 = rectangle2.calculateArea();
        double perimeter2 = rectangle2.calculatePerimeter();

        // Display the results for the second rectangle
        System.out.println("Results for the second rectangle:");
        rectangle2.display(area2, perimeter2);
    }
}
