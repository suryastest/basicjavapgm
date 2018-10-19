package Decisonmaking;

public class if_else_if {

	public static void main(String[] args) {
		
		
		String gender = "Male";
		String Title = "Mr";
		
		if (gender=="Male"){
			
			System.out.println("Welecome to club:"+Title);
		}
			else if(Title=="Mr"){
				
				System.out.println("Welecome to club "+Title);
			}	
             else {
				
				System.out.println("No Entry for Mens Club");
			}	
		

	}

}
