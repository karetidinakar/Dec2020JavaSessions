package InnerClasses;

public class LocalInnerClassConcept {
	int x = 10;
	static int y = 20;

	public void m1() {
		int a=12;
		final int b= 99;
		
		class MethodInner {
			
			public void innerm1() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(a);
				System.out.println(b);
			}
			
		}
		
		MethodInner mt = new MethodInner();
		mt.innerm1();
	}

	public static void main(String[] args) {
		LocalInnerClassConcept lic = new LocalInnerClassConcept();
		lic.m1();
	}

}
