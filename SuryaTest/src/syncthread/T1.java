package syncthread;

public class T1 extends Thread {
	
	Irctc ir1 = null;
	
	T1(Irctc ir)
	{
		ir1 = ir;
	}
	public void run(){
	for (int i = 1; i <= 250; i++){
	
	ir1.book(1, Thread.currentThread().getName());
	}
	}

}
