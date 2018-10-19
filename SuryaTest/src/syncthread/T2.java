package syncthread;

public class T2 extends Thread {
Irctc ir2 = null;
	
	T2 (Irctc ir)
	{
		ir2 = ir;
	}
	public void run(){
	for (int i = 1; i <= 250; i++){
	
	ir2.book(5, Thread.currentThread().getName());
	}

}
}