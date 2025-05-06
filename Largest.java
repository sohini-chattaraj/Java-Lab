//Lab Ques1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Largest
{
	public static void main(String args[])throws IOException 
	{
		int n1,n2,n3;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      		System.out.println("Enter any three numbers");
			try
			{
      				n1= Integer.parseInt(reader.readLine());
      				n2= Integer.parseInt(reader.readLine());
      				n3= Integer.parseInt(reader.readLine());	

				if(n1>n2 && n1>n3)
					System.out.println("Largest Number :-"+n1);
				else if(n2>n3)
					System.out.println("Largest Number :-"+n2);
				else
					System.out.println("Largest Number :-"+n3);
			}
			catch(NumberFormatException e) 
			{
 
                		// Print the message if exception occurred
                		System.out.println("NumberFormatException occurred");
				System.out.println("Enter valid integer inputs.");
            		}
				
   }
}
	
