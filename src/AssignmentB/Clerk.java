package AssignmentB;

public class Clerk extends Manager{

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.name="DYK";//only public
		Manager m2 =new Clerk();
        m2.name="Shruthi";//only public
	}

}
