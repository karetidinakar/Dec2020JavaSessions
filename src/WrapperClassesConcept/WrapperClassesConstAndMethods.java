package WrapperClassesConcept;

public class WrapperClassesConstAndMethods {

	public static void main(String[] args) {
		Double d = new Double(10.4);
		Double d1 = d+11.5;
		Double d2 = d+11.5;
		System.out.println(d1==d2);//false  //Float Double no buffer concept
		
		Integer i = new Integer(10);
		Integer i1 = i+11;
		Integer i2 = i+11;
		System.out.println(i1==i2);//true

	}

}
