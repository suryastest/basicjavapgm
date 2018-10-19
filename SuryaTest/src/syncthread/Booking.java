package syncthread;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Irctc ir = new Irctc();
T1 t1 = new T1(ir);
T2 t2 = new T2(ir);

t1.setName("T1");
t2.setName("T2");

t1.start();
t2.start();

System.out.println("completed");


	}

}
