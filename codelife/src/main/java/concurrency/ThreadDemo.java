package concurrency;

public class ThreadDemo {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread t1=new Thread(ticket, "1�Ŵ���");
		Thread t2=new Thread(ticket, "2�Ŵ���");
		Thread t3=new Thread(ticket, "3�Ŵ���");
		
		t3.start();
		t1.start();
		t2.start();

	}
}
