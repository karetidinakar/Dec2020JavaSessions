package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		Collections.sort(l3);
		
		System.out.println(l1.equals(l3));
		
		//Finding non common elements
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		//Finding common elements
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","Csharp","js"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","Csharp","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
	}

}
