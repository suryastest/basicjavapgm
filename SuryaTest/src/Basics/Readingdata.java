
package Basics;
import java.io.*;

public class Readingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  =new   BufferedReader( new InputStreamReader(System.in));
		  System.out.println("Enter  Any string");
		  String  str =   br.readLine();
		  System.out.println("str="+str);
		  System.out.println("Enter  Any Integer");
		  int  i = Integer.parseInt(br.readLine()); //parsing
		  System.out.println("i="+i);
		  System.out.println("Enter  Any Double");
		  double d = Double.parseDouble(br.readLine());
		  System.out.println("d="+d);
		  System.out.println("Enter  Any character");
		  char  ch = (char) br.read(); //type casting
		  System.out.println("ch="+ch);

	}

}
