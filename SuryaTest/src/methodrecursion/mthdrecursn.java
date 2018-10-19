package methodrecursion;

class mthdrecursn {

	void  show(int  n){
		if(n==0){
		return;
		}
		System.out.println(n);
		  show(n-1);
		}
		public  static  void  main(String ar[]){
			mthdrecursn   m = new  mthdrecursn();
		   m.show(10);
		}


}
