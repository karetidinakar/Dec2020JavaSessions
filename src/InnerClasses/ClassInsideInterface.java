package InnerClasses;

public interface ClassInsideInterface {

	int getNumberOfWheels();

	class Bus implements ClassInsideInterface {
		public int getNumberOfWheels() {
			return 6;
		}
	}
}

class Test {
	public static void main(String[] args) {

		ClassInsideInterface.Bus ib = new ClassInsideInterface.Bus();
		System.out.println(ib.getNumberOfWheels());
	}

}
