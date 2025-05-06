/*Write a program in java using roll, name, and cgpa as data members to input
the details of n students, followed by displaying their values. Next, display the
name of the student having the lowest cgpa.
Input: Enter Roll No, Name and cgpa of n number of students.
Output: Display the details of n number of students. Also display the
name of student with lowest cgpa
*/
import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

       
        Student[] students = new Student[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();


            students[i] = new Student(roll, name, cgpa);
        }

   
        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }


        Student lowestCGPAStudent = students[0]; // Assume the first student has the lowest CGPA initially
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCGPAStudent.cgpa) {
                lowestCGPAStudent = students[i];
            }
        }

        System.out.println("\nStudent with the lowest CGPA:");
        System.out.println("Name: " + lowestCGPAStudent.name);
    }
}