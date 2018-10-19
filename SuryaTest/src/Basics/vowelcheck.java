package Basics;
import java.io.*;
public class vowelcheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter Any Character");
		char ch  = (char) br.read();
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		  System.out.println(" It Is Vowel");
		}
		else{
		System.out.println(" It Is Not Vowel");
		}

		

	}

}
