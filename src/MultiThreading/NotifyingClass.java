package MultiThreading;

public class NotifyingClass extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread starts calculating");
			total=calculate(total);
				this.notify();
			}
			
			System.out.println("child thread sent notification");
		}

	public  int calculate(int total) {
		for(int i=0;i<100;i++) {
			total = total+i;
		}
		return total;
	}
	

}
