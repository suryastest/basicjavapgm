package BankAppwoinhe;

public class caaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custacc acc = new Custacc();
		acc.setName("CA_RAM");
		acc.setAccNo(1234567890);
		acc.setAddr("Hyd");
		acc.setAdhNo(123);

		System.out.println("Name : " + acc.getName());
		System.out.println("Acc No : " + acc.getAccNo());
		System.out.println("Addr : " + acc.getAddr());
		System.out.println("Adh NO : " + acc.getAdhNo());
		System.out.println("Members : " + acc.getMembers());

		acc.insert(1000);
		acc.insert(5000, 456);

		acc.get(1);
		acc.get(2);
		acc.get(3);
		acc.get(4);
		acc.get(5);
	}

}
