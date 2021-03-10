package JavaSessions;

public class SwitchCase {
    //case can only be constant expression
	// switch argument can be expression
	public static void main(String[] args) {

		int x = 10;
		final int y = 15;// if not final cannot use for case value
		switch (x + 1) {
		case 10:
			break;
		case 12:
			break;
		case 13:
		case 14:
		case 18:
			break;
		case 10 + 1:
			break;
		case y://y should be constant that is final
			break;
		default:
			break;
		}
		
		String browserName = "Chrome";
		//boolean b;
		switch(browserName.toLowerCase()) {
		case "chrome":
			System.out.println("Chrome Launched");
			break;
		case "firefox":
			System.out.println("firefox Launched");
			break;
		case "IE":
			System.out.println("IE Launched");
			break;
			default:
				System.out.println("Check Browser");
				break;
		}
		
		
		

	}

}
