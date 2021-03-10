package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ObjectLockClass {
//ReentrantLock rl = new ReentrantLock();
	public void wish(String name)  {
		//rl.lock();
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		//rl.unlock();
	}
	
}
