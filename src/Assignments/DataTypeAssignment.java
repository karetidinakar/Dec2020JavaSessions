package Assignments;

public class DataTypeAssignment {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Dinakar");
		System.out.println("-----------------");
		
		int x=16;
		int y=48;
		System.out.println("Sum of x and y is "+(x+y));//64
		System.out.println("result of y/x is "+(y/x));//3
		System.out.println("-----------------");
		
		int a= -7 + 8 * 22;//-7+176-->169
		int b= (35+9) % 6; //44%6-->2
		int c= 30 + -3*16 / 8 ;//30+(-6)--->30-6-->24
		int d=15 + 15 / 5 * 2 - 8 % 3 ;//15+(15/5)(2)-8%3-->15+3*2-2-->15+6-2-->19
		
		System.out.println(a+" "+b+" "+c+" "+d);//169 2 24 19
		System.out.println("-----------------");

		
		double dd = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); //;77/36-->2.138
		System.out.println(dd);
		System.out.println("-----------------");
		
		String s = "Hello world";
		char[] cc = new char[] {'t'};
		String s1 = new String(cc);
		s=s.concat(s1);
		System.out.println(s);
		System.out.println("-----------------");
		
		int ii =100;int jj=200;int kk=3400;System.out.println("Your Toal amount is. "+(ii+jj+kk));
		System.out.println("-----------------");
		
		byte vv = 065;//(5*8^0)+(6*8^1)+(0*8^2)
		System.out.println(vv);//(5*1)+(6*8)+(0*16)--->5+48+0--->53
		System.out.println("-----------------");
		
		int hh = 500;	//500/16-->31-->4(remainder) ////31/16-->1-->15(remainder)-->1-->15-->4	
		System.out.println(Integer.toHexString(hh));//1f4
		
		
	}

}
