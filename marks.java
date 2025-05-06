import java.util.Scanner;

public class marks{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 	System.out.println("Enter the marks of chemistry");
	int m=scanner.nextInt();
	if(m>=90){
		System.out.println("A");}
	if(m>=80 && m<90){
		System.out.println("B");}
	if(m>=70 && m<80){
		System.out.println("C");}
 	if(m>=60 && m<60){
		System.out.println("D");}
	if(m>=50 && m<60){
		System.out.println("E");}
	if(m>=40 && m<50){
		System.out.println("F");}
	if(m<40){
		System.out.println("Failed");}
	

        
    }
}    

