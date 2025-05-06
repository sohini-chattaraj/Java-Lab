import java.util.Scanner;
interface Employee {
    void getDetails();
}

interface Manager {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

       public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee id - ");
        empId = scanner.nextInt();

        System.out.print("Enter employee name - ");
        scanner.nextLine(); 
        empName = scanner.nextLine();
    }

  
    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department id - ");
        deptId = scanner.nextInt();

        System.out.print("Enter department name - ");
        scanner.nextLine(); // Consume the newline character
        deptName = scanner.nextLine();
    }

    // Method to display all details
    public void displayDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class Lab5d{
    public static void main(String[] args) {
        Head head = new Head();

        // Get employee details
        head.getDetails();

        // Get department details
        head.getDeptDetails();

        // Display all details
        head.displayDetails();
    }
}








