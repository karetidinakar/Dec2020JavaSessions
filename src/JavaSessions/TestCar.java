package JavaSessions;

public class TestCar implements Cloneable {

	public static void main(String[] args) {
		ThisBMW bmw = new ThisBMW();
		
		ThisBMW bmw1 = new ThisBMW("BMW520D",12000);
		System.out.println(bmw1.name+" : "+bmw1.price);
		
		bmw1.getSuperValues();
		
		System.out.println(".........................");
	
		ThisCar c3 = new ThisCar(bmw1);
		System.out.println(c3.name+" : "+c3.price);
		
		
		int[][] aaa = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(aaa.length);
	}

}
