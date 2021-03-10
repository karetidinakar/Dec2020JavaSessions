package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		long l1 = 10000;
		Long ll = 10000l;// same as (Long)10000l or (long)10000l
		Long ll1 = (Long) 10000l;
		Long ll2 = (long) 10000l;
		char c = 'a';
		c++;// implicit conversion of int to char
		System.out.println(c);// b
		// char b = c+1;invalid
		c = (char) (c + 1);// converting int to char
		System.out.println(c);// c
		char b = 'b';
		System.out.println(b - c);
		System.out.println((char) (b + c));// 98+99=197

		// System.out.println(10/0);
		System.out.println(10.0 / 0);
		System.out.println(10d / 0);
		int m = 10;
		System.out.println(m++);// 10
		System.out.println(m++);// 11

		// -128+((n-1)-(how much to add to variable value to be equal to 127))
		byte bb = 125;
		byte bbb = (byte) (bb + 58);// -128+((n-1)-(how much more is equal to 127)) n is 58 here--->-128+57
		System.out.println(bbb);

		byte cc = 127;
		byte ccc = cc++;// -128+((1-1)-0)
		System.out.println(ccc);

//		int x = 100;
//		System.out.printf("Printing simple integer:  %d\n", y);
//
//		String s = "Dinakar";
//		System.out.printf("Printing simple String:  %s\n", s);
//
//		char cf= 'D';
//		System.out.printf("Printing simple char:  %c\n", cf);
//		
//		double d = 123.33;
//		System.out.printf("Printing simple integer:  %f\n", d);

		double db = 0786d;// not a valid integer in octal form
		Double dbc = 0786d;// not a valid integer in octal form
		System.out.println(db + "<<<<<<<<<<<>>>>>>>>>>>> " + dbc);

		Double dd = 0234.55;
		Double ddc = 1234d;// not a valid integer in Decimal form

		// double dh = 0xBrd;//INVALID---not a valid integer in HexaDecimal form
		// Double dh = 0xBrd;//INVALID---not a valid integer in HexaDecimal form

		int[] i = new int[] { 12, 55, 33, 22 };
		Integer[] in = new Integer[] { 12, 55, 33, 22 };
		Number[] n = new Number[] { 12, 55, 33, 22 };

		System.out.println(i.getClass() + ",,,,,,,,,,,............");
		System.out.println(in.getClass() + ",,,,,,,,,,,............");
		System.out.println(n.getClass() + ",,,,,,,,,,,............");
		// i=n;//INVALID
		// n=i;//INVALID

		int[] ii = new int[] { 12, 55, 33, 22 };
		double[] nn = new double[] { 12, 55, 33, 22 };

		// ii=nn;//INVALID
		// nn=ii;//INVALID

		Double[] nd = new Double[] { 12.6, 55.4, 33.3, 22.3 };
		Number[] nN = new Number[] { 12, 55, 33, 22 };

		// nd=nN;//INVALID
		nN = nd;// VALID
	}

}
