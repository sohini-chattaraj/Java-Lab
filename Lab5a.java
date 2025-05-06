import java.util.Scanner;


abstract class Student {
   
    protected int rollNo;
    protected long regNo;

    
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll no - ");
        rollNo = scanner.nextInt();

        System.out.print("Enter Registration no - ");
        regNo = scanner.nextLong();
    }


    public abstract void course();
}


class KiiTian extends Student {
    
    public void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}


public class Lab5a{
    public static void main(String[] args) {
        KiiTian kiiTian = new KiiTian();

        // Get input for roll no and registration no
        kiiTian.getInput();

        // Display details including course
        System.out.println("Roll no - " + kiiTian.rollNo);
        System.out.println("Registration no - " + kiiTian.regNo);
        kiiTian.course();
    }
}
