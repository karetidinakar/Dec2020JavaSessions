package Assignments;

public class PrimeNumber {
	
	 public static int nextPrime(int num) {
	      num++;
	      for (int i = 2; i < num; i++) {
	         if(num%i == 0) {
	            num++;
	            i=2;
	         } else {
	            continue;
	         }
	      }
	      return num;
	   }

	public static void main(String[] args) {

		int i = 11;
		outerLoop: for (;; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if ((i + 1) % j == 0) {
					continue outerLoop;
				}
			}		
				System.out.println(i + 1);
				break;
		}
//		int i =13;
//		i++;
//		for (int j = 2; j <= i / 2; j++) {
//			System.out.println(i+"  "+j);
//			if (i % j == 0) {
//				continue ;
//			}
//			//System.out.println(i);
//		}
		
	
	}
}
