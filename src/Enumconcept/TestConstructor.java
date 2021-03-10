package Enumconcept;

public class TestConstructor {
	enum Beer {
		KF, BR, RC;

		Beer() {
			System.out.println("constructor");
		}
	}

	public static void main(String[] args) {
		//Beer b = Beer.BR;
		System.out.println("Hello");
	}

}
