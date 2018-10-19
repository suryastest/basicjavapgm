package Basics;

public class Logicaloperator {

	public static void main(String[] args) {
		// Logical Operators : && || & | ! ^
		//And Operator ‘&&’: This returns true if the output of both the operands are true
		//OR Operator ‘||’:This returns true if the output of either operands are true
		//NOT Operator ‘!’ This invert the state of the condition
		
		boolean Output_1 = true;
		boolean Output_2 = false;
		System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
		System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
		System.out.println("Change the state of the Output_1 to false : " + (!Output_1));
 	
		
	}

}
