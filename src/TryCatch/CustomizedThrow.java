package TryCatch;

public class CustomizedThrow extends RuntimeException {

	CustomizedThrow(String s) {
		super(s);
	}

	public static void throwMethodWithMessage() {

		throw new CustomizedThrow("this is customized exception");
	}

	public static void main(String[] args) {
		//throwMethodWithMessage();
		Thread.currentThread().setName("My Main");
		System.out.println(Thread.currentThread().getName());
	}

}
