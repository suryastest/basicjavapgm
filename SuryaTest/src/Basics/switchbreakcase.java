package Basics;
import java.io.*;
public class switchbreakcase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enterr Any 2 Numbers");  
		 int  a= Integer.parseInt(br.readLine());
		   int b=Integer.parseInt(br.readLine());
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Quotient");
		System.out.println("5.Remainder");
		System.out.println("Enter Your Choice");  
		  int choice=Integer.parseInt(br.readLine());
		 switch(choice){ 
		   case  1:  System.out.println("Addition="+(a+b));
			break;
		   case  2:  System.out.println("Subtraction="+(a-b));
			break;
		   case  3:  System.out.println("Multiplication="+(a*b));
			break;
		   case  4:  System.out.println("Quotient="+(a/b));
			break;
		   case  5:  System.out.println("Remainder="+(a%b));
			break;
		   default:  System.out.println("Invalid choice");
		   }

	}

}
