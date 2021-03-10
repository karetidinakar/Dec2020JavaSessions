package Enumconcept;

import Enumconcept.TestConstructor.Beer;

public class EnumConstWithArgs {
	enum Beer {
		KF(78), BR(99), RC(69), FO;

		int price;

		Beer() {
			this.price = 65;
			System.out.println("Constructor");
		}

		Beer(int price) {
			this.price = price;
			System.out.println("Constructor with args");
		}
		
		public int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
	//	Beer b = Beer.BR;
		
	//	System.out.println(b+"      "+b.getPrice());
		Beer[] bArr = Beer.values();
//		for(int i=1;i<2;i++) {
//			System.out.println( bArr[i]+"      "+bArr[i].getPrice()+"     "+bArr[i].ordinal());
//		}
		for(Beer b:bArr) {
			System.out.println(b+"      "+b.getPrice()+"     "+b.ordinal());
		}

	}

	}


