import java.util.Scanner;
class Subtraction
{
public int subtract(int a,int b){
return a-b;
}
public double subtract(double a,double b)
{
return a-b;
}
public int subtract(int a,int b,int c)
{
return a-b-c;
}
public class driver
{
public static void main(String[] args)
{
Scanner obj= new Scanner();
int result1 =obj.subtract(10, 5);
System.out.println("Result 1: " + result1);
double result2 = obj.subtract(15.5, 7.3);
System.out.println("Result 2: " + result2);
int result3 = obj.subtract(20, 8, 3);
System.out.println("Result 3: " + result3);     
}
}
}


 

