package ModfiersSpecifiers;

public class AbstractClass {

	public static void m( int x, int y) {
		System.out.println(x + "   " + y);
		x = 100;
		y = 200;
		System.out.println(x + "   " + y);
	}

	public static void main(String[] args) {
		m(10, 20);
	}

}
