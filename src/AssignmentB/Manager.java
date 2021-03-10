package AssignmentB;

import Assignments.Employee;

public class Manager extends Employee {
	//public String name="Shanker";
	//String s="Aims";
	//protected int salary=1022000;
	public static void main(String[] args) {
		Employee e1 = new Manager();
		//e1.name = "Dinakar Kareti";//only public
		Manager m1 = new Manager();
		//m1.name = "Kareti Dinakar Yadav";//public
		//m1.salary=123123;	//protected	
		
		e1.name="Vankar";
		System.out.println(m1.name);
	}

}
