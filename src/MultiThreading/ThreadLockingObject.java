package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLockingObject extends Thread {
	static ReentrantLock rl = new ReentrantLock();
	ObjectLockClass olc;
	String name;

	ThreadLockingObject(ObjectLockClass ol, String name) {
		this.olc = ol;
		this.name = name;
	}

	public void run() {

			//if (rl.tryLock()) {
				 try {
					if (rl.tryLock(10, TimeUnit.SECONDS)) {
					olc.wish(name);
					rl.unlock();
					//break;
}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public static void main(String[] args) {
		ObjectLockClass olc = new ObjectLockClass();

		ThreadLockingObject tlo1 = new ThreadLockingObject(olc, "Dhoni");
		ThreadLockingObject tlo2 = new ThreadLockingObject(olc, "Yuvraj");

		tlo1.start();
		tlo2.start();
		ExecutorService service = Executors.newFixedThreadPool(5);
		//service.submit(arg0)
		
	}

}
