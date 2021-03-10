package JavaBasics;

import java.util.Arrays;

public class JavaDataTypes {

	public static void varArgs(int...i) {
		System.out.println(Arrays.toString(i)+"  "+i[0]);
	}
	public static void main(String[] args) {
		long l = 2147483647;
		Long L = 2147483647l;
		float f = 10;
		float ff = 10.5f;
		Float F = 10f;//When AutoBoxing or Widening or AB followed by W not possible use suffix "d";
		Float FF = 10.5f;
		double d = 10;
		double dd = 10.5;
		Double D = 10d;//When AutoBoxing or Widening or AB followed by W not possible use suffix "d";
		Double DD = 10.5;
		
		int[] i = {10,2,3,4,5};
		double[] da= {10.5,10,55,55.5f};
		
		//da=i;not allowed for primitive
		Object[] obj = {new Object(),new String("class")};
		String[] str = {new String("can"),new String("class")};
		//str=obj;
		obj=str;//allowed for reference
		System.out.println(Arrays.toString(obj));
		
		//varArgs();
		varArgs(2);
		int[] a= {3,2,5,7,8};
		varArgs(a);
		
		//Negate
		System.out.println(~3);//binary form+binary 1
		System.out.println(~-12);//binary form reverse bits +binary 1+binary form reverse bits
		
		byte b = 122;
		b+=10;
		System.out.println(b);
		
	}

}
