package CollectionsConcept;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapRedBalckTree {
//first put is the root
	public static void main(String[] args) {
		//TreeMap<Integer,String> tm= new TreeMap<>();
		TreeMap<Integer,String> tm= new TreeMap<>(Comparator.reverseOrder());
		tm.put(1000,"tom");//--->root(1000)
		tm.put(2000,"lisa");
		tm.put(3000,"peter");
		tm.put(4000,"harry");
		tm.put(50000,"monroe");
		
		tm.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.floorKey(3000));
		
		TreeMap<String,Integer> tms= new TreeMap<>();
		tms.put("Broad", 200);
		tms.put("Augustine", 100);
		tms.put("mario", 100);
		tms.put("monroe", null);
		tms.put("Steve", 150);
		tms.put("Narry", 175);
		
		tms.forEach((k,v)->System.out.println(k+":"+v));
		

	}

}
