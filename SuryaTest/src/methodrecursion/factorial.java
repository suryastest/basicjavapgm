package methodrecursion;

public class factorial {

	int   fact(int  n){
		if(n==1){
		return 1;
		}
		else{
		return  n*fact(n-1);
		}
		}
		public  static  void  main(String ar[]){
			factorial   m = new  factorial();
		 int res =  m.fact(5);
		System.out.println("5!="+res);
		}


}
