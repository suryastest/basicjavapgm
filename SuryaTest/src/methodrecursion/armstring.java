package methodrecursion;

public class armstring {
	boolean  isArmStrong(int n){
	     int  r,sum=0,m=n;
	       while(n>0){
	          r=n%10;
	        sum=sum+r*r*r;
	         n=n/10;
	         }
	      if(sum==m){
	       return  true;
	      }
	    else{
	       return false;
	      }
	    }  
	public  static  void  main(String ar[]){
		armstring   m = new  armstring();
	for(int i=1;i<=1000000;i++){
	    if(m.isArmStrong(i)== true){
	      System.out.println(i);
	    }
	}}

}
