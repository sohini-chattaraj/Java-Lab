import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for User " + i + ":");

            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

           
            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();

           
            System.out.print("Enter section: ");
            String section = scanner.nextLine();

          
            System.out.print("Enter branch: ");
            String branch = scanner.nextLine();

            
            System.out.println("User " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Section: " + section);
            System.out.println("Branch: " + branch);

            
            System.out.println();
        }

        
    }
}