interface Motor{
int capacity=0;
void run();
void consume();
}
class WashingMachine implements Motor {
int capacity;
WashingMachine(int capacity)
{
this.capacity=capacity;
}
public void run()
{
System.out.println("the washing machine is running");
}
public void consume()
{
System.out.println("the washing machine is consuming electricity");
}
public void printcapacity()
{
System.out.println("the washing machine capacity="+capacity);
}
}
public class Lab5b{
public static void main(String[] args) {
WashingMachine washingMachine = new WashingMachine(5);          
washingMachine.run();
washingMachine.consume();
washingMachine.printcapacity();
}
}







 