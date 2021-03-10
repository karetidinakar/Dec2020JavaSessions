package MultiThreading;

public class WaitCallingClass {
	
	//static NotifyingClass ncm;
	public static void fourTimes(int x) {
		int y=0;
		for(int i=0;i<x*x*x;i++) {
			y=y+x;
		}
		System.out.println(y);
	}
	public static void cube(int x) {
		int y=0;
		for(int i=0;i<x*x;i++) {
			y=y+x;
		}
		System.out.println(y);
	}
	public static void square(int x) {
		int y=0;
		for(int i=0;i<x;i++) {
			y=y+x;
		}
		System.out.println(y);
	}
	public static void main(String[] args) throws InterruptedException {
		NotifyingClass nc = new NotifyingClass();
		nc.start();
		synchronized(nc) {
			System.out.println("main thread waiting");
			nc.wait();
			System.out.println("main thread got notification");
			System.out.println(nc.total);
			square(4);
			cube(4);
			fourTimes(4);
		}

	}

}
