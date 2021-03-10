package JavaSessions;

public class ThisBMW extends ThisCar {

	String name;
	int price;
	
	public ThisBMW() {
		
	}

	public ThisBMW(String name, int price) {
		super(name,price);
		this.name=name;
		this.price=price;
	}
	
	public void getSuperValues() {
		System.out.println(super.name+"  "+super.price);		
	}

	public static void main(String[] args) {
	
	}



}
