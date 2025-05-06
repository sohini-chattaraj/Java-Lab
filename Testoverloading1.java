class Subtractor
{ 
int subtract(int a, int b)
{
return a-b;
} 
double subtract(double a, double b)
{
return a-b;
} 
} 
class Testoverloading1
{ 
public static void main(String[] args)
{ 
Subtractor a1 = new Subtractor();
System.out.println(a1.subtract(11,11)); 
System.out.println(a1.subtract(12.3,12.6)); 
}
}