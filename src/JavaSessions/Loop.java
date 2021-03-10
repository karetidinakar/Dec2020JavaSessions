package JavaSessions;

public class Loop {

	public static void main(String[] args) {

		int i = 10;
		while (i >= 1) {	
			System.out.print(i+" ");
			i--;
		}
		
		System.out.println(" ");
		
//		final boolean flag = false;
//		while(flag) {
//			System.out.println("true");
//		}
		
//		for(int j=0;j<=13;j=j+2) {
//			j++;
//			System.out.print(j+" ");//here j value is increased
//			
//		}
		
		System.out.println("");
		
		for(int j=0;j<=13;j=j+2) {
			System.out.print("Lower j value"+" "+j+" ");
			System.out.print(j+1+" ");//here j +1 value is printed
		}
	}

}
