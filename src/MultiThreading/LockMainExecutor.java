package MultiThreading;

public class LockMainExecutor {

	public static void main(String[] args) {
		ObjectLockClass olc = new ObjectLockClass();
		
		ThreadLockingObject tlo1 = new ThreadLockingObject(olc,"Dhoni");
		ThreadLockingObject tlo2 = new ThreadLockingObject(olc,"Yuvraj");
		
		tlo1.start();
		tlo2.start();
	}

}
