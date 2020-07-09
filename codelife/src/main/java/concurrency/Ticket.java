package concurrency;

public class Ticket implements Runnable {

	static int mount = 10;
	Object lock = new Object();

	public void run() {
		while (true) {
			synchronized (lock) {
				if (mount > 0) {
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "ÕıÔÚÂôÆ±£¬Ê£ÓàÆ±Êı£º" + mount--);

				}
			}
		}
	}

}
