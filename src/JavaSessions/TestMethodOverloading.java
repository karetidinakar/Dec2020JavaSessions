package JavaSessions;

    //IF THERE IS NO EXACT MATCH AND HAS TWO PARTIAL MATCHES THEN ERROR;
    //null matches with every class.
    //null prefers CHILD over PARENT.
    
public class TestMethodOverloading {
	public static void m1(long mn, int x) {
		System.out.println("long and int");
	}

	public static void m1(int m, long y) {
		System.out.println("int and long");
	}

	// WITHOUT BELOW METHOD WE GET ERROR
	public static void m1(int m, int y) {// EXACT MATCH
		System.out.println("int and int");
	}

	public static void m1(Object o) {
		System.out.println("matches null too like string");
	}

	public static void m1(String s) {
		System.out.println("null prefers CHILD over PARENT");
	}

	public static void main(String[] args) {

		m1(null);
		m1(10, 11);
	}

}
