package WideningAutoBoxVarArgs;

public class WideningAutoBoxVarArgs {

	public static void WideAutoBoxVarArg(long l) {
		System.out.println("Widenening");
	}
	public static void WideAutoBoxVarArg(Integer i) {
		System.out.println("autoBoxing");
	}
	public static void WideAutoBoxVarArg(int... i) {
		System.out.println("Var Args");
	}
	public static void main(String[] args) {
		WideAutoBoxVarArg(10);

	}

}
