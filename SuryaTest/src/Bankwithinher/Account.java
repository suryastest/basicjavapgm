package Bankwithinher;

public class Account {

	private long accNo;
	private String name;
	private int adhNo;
	private String addr;
	private byte members = 1;

	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdhNo() {
		return adhNo;
	}
	public void setAdhNo(int adhNo) {
		this.adhNo = adhNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public byte getMembers() {
		return members;
	}

	void deposit(int hardCash) {
		System.out.println("Amount Deposited: " + hardCash);
	}
	void deposit(int checkNo, int cash) {
		System.out
				.println(cash + " amount Deposited with check no: " + checkNo);
	}

	void withdraw(int noOfTimes, int cash) {
		if (noOfTimes > 5) {
			System.out.println("Charges Rs.150/-");
		}
		System.out.println("Withdraw Amount : " + cash);
	}
}
