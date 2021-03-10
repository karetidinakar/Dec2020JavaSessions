package JavaSessions;

public class ThisCar {

	
	String name;
	int price;
	
	public ThisCar() {
	
	}
	
	public ThisCar(String name,int price) {
		System.out.println("car parameterized constructor");
		this.name=name;
		this.price=price;
	}
	
	public ThisCar(ThisBMW b) {
		this.name=b.name;
		this.price=b.price;
	}
	
	public static void main(String[] args) {
		
		String y ="100test";
		char[] c = y.toCharArray();
		for(int i=0;i<c.length;i++) {
		if(Character.isDigit(c[i])!=true) {
			y=y.substring(0, i);
			break;
		}
		
	}
		int x=Integer.parseInt(y);
		System.out.println(x+20);
	}
}
