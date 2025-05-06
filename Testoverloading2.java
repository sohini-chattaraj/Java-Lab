class Areaproblem
{ 
int area(int a, int b)
{
return a*b;
} 
double area(double a, double b,double c)
{
return (a*b*c*0.5);
} 
double area(int a)
{
return (a*a);
} 
} 
class Testoverloading2
{ 
public static void main(String[] args)
{ 
Areaproblem a1 = new Areaproblem();
System.out.println(a1.area(11,11)); 
System.out.println(a1.area(12.3,12.6,12.8));
System.out.println(a1.area(12));
}
}

 