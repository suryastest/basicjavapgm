package BankAppwoinhe;

public class saaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savacc acc = new savacc();

		acc.setName("SA_RAM");
		acc.setAccNo(1234567890);
		acc.setAddr("Hyd");
		acc.setAdhNo(123);

		System.out.println("Name : " + acc.getName());
		System.out.println("Acc No : " + acc.getAccNo());
		System.out.println("Addr : " + acc.getAddr());
		System.out.println("Adh NO : " + acc.getAdhNo());
		System.out.println("Members : " + acc.getMembers());
		
		System.out.println("withdraw history : " );

		acc.deposit(1000);
		acc.deposit(5000, 456);

		acc.withdraw(1);
		acc.withdraw(2);
		acc.withdraw(3);
		acc.withdraw(4);
		acc.withdraw(5);
		acc.withdraw(6);
	}

}
