package syncthread;

public class Irctc {
	
	int tickets = 2500;

	synchronized void book(int count, String tname) {
		// TODO Auto-generated method stub
tickets = tickets - count;
System.out.println(tname + "::" + tickets);
	}

}
