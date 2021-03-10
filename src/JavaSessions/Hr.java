package JavaSessions;

public class Hr extends Department{

	int dept_code =102;
	
	public void getDeptId() {
		System.out.println(this.dept_code);
		System.out.println(dept_code);
		System.out.println(super.dept_code);
	}
	
	
	public void getDeptInfo() {
		System.out.println("HR-- Info");
		super.getDeptInfo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
