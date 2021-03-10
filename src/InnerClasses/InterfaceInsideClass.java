package InnerClasses;

public class InterfaceInsideClass {

	 interface Vehicle{
		int getNumberOfWheels();
	}
	class Bus implements Vehicle{
		public int getNumberOfWheels() {
			return 6;
		}
	}
	public static void main(String[] args) {
		
		InterfaceInsideClass.Vehicle v= new InterfaceInsideClass().new Bus();
		v.getNumberOfWheels();
	}

}
