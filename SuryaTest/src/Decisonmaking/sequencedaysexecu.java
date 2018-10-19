package Decisonmaking;

import java.sql.Date;
import java.util.Calendar;

public class sequencedaysexecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer browserCount = 3;
		  Calendar cal = Calendar.getInstance(); 
		  java.util.Date d = new Date(browserCount);
		  for(int i=1;i<=30;i++)
		  {
		   for(int j=1;j<=browserCount;j++)
		   {
		    cal.setTime(d); 
		    cal.add(Calendar.DATE,1);
		    d = cal.getTime();
		    System.out.println(d+"Browser:"+j);
		    
		    }	
	}
	}
}	
	


