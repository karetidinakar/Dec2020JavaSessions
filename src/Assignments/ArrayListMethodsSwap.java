package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class ArrayListMethodsSwap {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();ar.add("Strong");ar.add("Be");ar.add(117);
		ar.add(119.3);
		System.out.println(ar);
		System.out.println("---------Swap ArrayList Elements------------------");
		ar.add(ar.get(0));
		ar.set(0, ar.get(1));//update or replace(set) and retrieve(get())
		ar.set(1, ar.get(ar.size() - 1));
		ar.remove(ar.size() - 1);//remove
		System.out.println(ar);
		System.out.println("---------Portion of ArrayList----------------");
		List l = ar.subList(1, 3);
		ArrayList arSyb = new ArrayList(l);
		System.out.println(arSyb);
		System.out.println("---------Reverse ArrayList-------------------");
		Collections.reverse(ar);
		System.out.println(ar);
		System.out.println("---------Trim to Size------------------");
		ar.trimToSize();
		System.out.println("-----------Clear----------------");
        //ar.clear();
        System.out.println(ar);
		System.out.println("-----------Printing using position----------------");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-----------Search----------------");
		System.out.println(ar.contains(33));
		System.out.println(ar.contains("Strong"));
		
		System.out.println("-----------Remove Third element----------------");
		ar.remove(2);
		System.out.println(ar);
		System.out.println("-----------Inserting first and last elements----------------");
		ar.add(0,"Inserting at first position");
		ar.add("Inserting at last position");
		System.out.println(ar);
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
	        al.add(30); 
	        al.add(20); 
	        al.add(10); 
	        al.add(40); 
	        al.add(50); 
	  
	        /* Collections.sort method is sorting the 
	        elements of ArrayList in descending order. */
	        Collections.sort(al, Collections.reverseOrder()); 
	        //Collections.sort(al);
	        // Let us print the sorted list 
	        System.out.println(al); 
	        //to be sorted firstr before binary Search
	        int j = Collections.binarySearch(al,50, Collections.reverseOrder());
	        System.out.println(j);
	       
//	        char cc = 't';
//	        cc.toString();
	}

}
