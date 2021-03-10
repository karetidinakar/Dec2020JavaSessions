package Enumconcept;



public class TestEnums {
	enum Beer {
		KF,BR,RC{
			public  String  m1() {
				Beer b = Beer.RC;
				return b.toString();
			}	
		},HR;
		public  String  m1() {
			Beer b = Beer.HR;
			return b.toString();
		}
	}
	public static void main(String[] args) {
		Beer[] bArr = Beer.values();
		for(Beer b:bArr) {
			System.out.println(b+"      "+b.m1());
		}
	}

	}


