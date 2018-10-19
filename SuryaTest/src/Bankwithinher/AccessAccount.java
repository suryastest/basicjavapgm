package Bankwithinher;

public class AccessAccount {

	/**
	  Account acc -> Method 1st Parameter.
	  If we use super class ref variable, then only we can able to 
	  write Generic Code for all the Accounts. 
	*/
	static void access(Account acc, long accNo, 
		String name, int adhNo, String addr) {

		acc.setAccNo(accNo);
		acc.setName(name);
		acc.setAdhNo(adhNo);
		acc.setAddr(addr);

		System.out.println("Name = " + acc.getName());
		System.out.println("Acc No = " + acc.getAccNo());
		System.out.println("AdhNo = " + acc.getAdhNo());
		System.out.println("Addr = " + acc.getAddr());
		System.out.println("Members = " + acc.getMembers());

		acc.deposit(4000);
		acc.deposit(345, 6000);

		acc.withdraw(1, 1000);
		acc.withdraw(2, 1000);
		acc.withdraw(3, 1000);
		acc.withdraw(4, 1000);
		acc.withdraw(5, 1000);
		acc.withdraw(6, 1000);
	}

	public static void main(String[] args) {
		Account acc = null;
		
		System.out.println("SA Details: ########");
		acc = new SA();
		access(acc, 123456, "SA_RAM", 123, "HYD");

		System.out.println("JA Details: %%%%%%%%");
		acc = new JA();
		access(acc, 234567, "JA_RAM", 1234, "SEC");

		System.out.println("CA Details: $$$$$$$$$$$");
		acc = new CA();
		access(acc, 34567, "CA_RAM", 456, "BANG");
	}
}
