package BankAppwoinhe;

public class Custacc {
	private String name;
	private long accNo;
	private String addr;
	private int adhNo;
	private byte members = 1;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAdhNo() {
		return adhNo;
	}
	public void setAdhNo(int adhNo) {
		this.adhNo = adhNo;
	}
	public byte getMembers() {
		return members;
	}

	void insert(int hardCash) {
		System.out.println("Deposited Amount:" + hardCash);
	}
	void insert(int cash, int checkNo) {
		System.out.println("Deposited Amount:" + cash + " with Check No:"
				+ checkNo);
	}

	void get(int noOfTimesPerMon) {
		System.out.println("WithDraw Amount: 100");
	}

}
