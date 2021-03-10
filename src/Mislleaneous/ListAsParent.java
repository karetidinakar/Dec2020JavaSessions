package Mislleaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListAsParent {
	
	static char c;
	
	public static void ListAsParameter(List ll) {
		System.out.println("Can take ArrayList and LinkedList refeerences");
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(50);
		System.out.println(al);//[10, 20, 10, 50]-->square brackets
		LinkedList<Integer> l = new LinkedList<>();
		l.add(110);
		l.add(210);
		l.add(110);
		l.add(510);
		
		ListAsParameter(al);
		ListAsParameter(l);
		System.out.println("-------------------------------");
		int[][] ar = {
				{1,2,3},{11,22,33},{555,666,777}
		};
		
		for(int[] x:ar) {
			for(int y:x) {
				System.out.println(y);
			}
		}
		System.out.println("-------------------------------");
		//Object o = new Object();//will get error at runtime when 3rd line executed
		Object o = new String();
		String s = (String)o;
		System.out.println("-------------------------------");
		
		Map m = new HashMap();
		m.put("A", 1);
		m.put("AA", 2);
		m.put("AAA", 3);
		m.put("AAAA", 4);
		
		System.out.println(m);//{AA=2, A=1, AAA=3, AAAA=4}-->Flower brackets
		System.out.println("-------------------------------");
		System.out.println(c);//default value of char is space or \u0000
		System.out.println("-------------------------------");
	}

}
