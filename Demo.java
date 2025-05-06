import java.util.Scanner;
class Box
{
double length;
double width;
double height;
double volume()
{
return length*width*height;
}
}
public class Demo{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Box myBox = new Box();
System.out.println("Enter the length of the box: ");
myBox.length = scanner.nextDouble();
System.out.println("Enter the width of the box: ");
myBox.width = scanner.nextDouble();
System.out.println("Enter the height of the box: ");
myBox.height = scanner.nextDouble();
double boxVolume = myBox.volume();
System.out.println("The volume of the box is: " + boxVolume);
}
}