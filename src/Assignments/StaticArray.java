package Assignments;

public class StaticArray {

	public static void main(String[] args) {
		
		Object[] player1 =  {	"Pavan",25,	"India","10-02-1995","Male",117.50	};
		Object[] player2 = {"Steven",29,"England","11-11-1991","Male",99.00	};
		
		Object[] player3 =  {"Gammy",31,"West Indies","29-11-1989","Male",127.00	};
		Object[] player4 =  {"Linga",27,"Sri Lanka","31-11-1993","Male",67.5	};
		
		for(Object o:player1) {
			System.out.println(o);
		}
		
		System.out.println("--------------");
		
		for(Object o:player2) {
			System.out.println(o);
		}
		
		System.out.println("--------------");
		
		for(Object o:player3) {
			System.out.println(o);
		}
		
		System.out.println("--------------");
		
		for(Object o:player4) {
			System.out.println(o);
		}

	}
	

}
