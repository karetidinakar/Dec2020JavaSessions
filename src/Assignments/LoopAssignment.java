package Assignments;

public class LoopAssignment {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			System.out.println("I am Batman\n");
		}
		System.out.println("-------------------");
		for (int i = 0; i < 9; i++) {

			System.out.println("I am Batman " + (i + 1) + "\n");
		}
		
		System.out.println("-------------------");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println("");
		}

		System.out.println("-------------------");
		int j = -100;
		if (j < 0) {
			System.out.println("Negative number");
		}
		
		System.out.println("-------------------");
		
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		System.out.println("-------------------");
		
		int k=10;
		while(k>=1) {System.out.print(k+" ");
		k--;}
		System.out.println("");
		
		System.out.println("-------------------");
		
		int x=10;
		do {System.out.print(x+" ");
		x--;}while(x>=1);
		System.out.println("");
		System.out.println("");
		
		System.out.println("-------------------");
		
		for (int i = 0; i <=9; i++) {
			System.out.println("Hello World" + "\n");
		}
		
		System.out.println("-------------------");
		for (int i = 1; i <=10; i++) {
			if(i%7!=0) {
			System.out.print(i+" ");
			}
		}
	
		System.out.println("");
		System.out.println("");
		
		System.out.println("-------------------");
		
		for (int i = 4; i >= 0; i--) {
		System.out.println("n = "+i);
		}

	}

}
