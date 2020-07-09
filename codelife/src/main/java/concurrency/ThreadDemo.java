package concurrency;

public class ThreadDemo {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread t1=new Thread(ticket, "1ºÅ´°¿Ú");
		Thread t2=new Thread(ticket, "2ºÅ´°¿Ú");
		Thread t3=new Thread(ticket, "3ºÅ´°¿Ú");
		
		t3.start();
		t1.start();
		t2.start();

	}
}
