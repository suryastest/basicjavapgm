package Basics;
import java.io.*;
public class findgreaternum {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter Any 3 Numbers");
		 int a =  Integer.parseInt( br.readLine());  
		 int b =  Integer.parseInt( br.readLine());  
		 int c =  Integer.parseInt( br.readLine());  
		if(a>=b&&a>=c){
		  System.out.println(a+" Is Big Number");
		}
		else
		if(b>=c&&b>=a){
		  System.out.println(b+" Is Big Number");
		}
		else{
		  System.out.println(c+" Is Big Number");
		}

		
	}

}
