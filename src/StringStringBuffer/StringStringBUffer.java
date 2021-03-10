package StringStringBuffer;

public class StringStringBUffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Durga");//16+5=21 capacity
		System.out.println(sb1.capacity());//21
		System.out.println(sb1.length());//5
		StringBuffer sb2 = new StringBuffer(new String("Durga"));
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer(5);//Default Capacity  16
		System.out.println(sb1);
		
		
		String s1 = new String("Durga");
		String s2 = new String( new StringBuffer("Durga"));
		String s3 = new String();
		//String s4 = new String(byte [] b);
		//String s5 = new String(char [] ch);
		
	
		
		
		
	}

}
