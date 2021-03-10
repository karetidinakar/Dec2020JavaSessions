package CollectionsConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {
//Diff hashcode can be in same bucket
	public static void main(String[] args) {
		HashMap<String,String> capitalMap = new HashMap<>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington");
		capitalMap.put("UK", "london");
		capitalMap.put("USA", "Washington DC");
		System.out.println(capitalMap);
		
		Set<Entry<String, String>> entries=capitalMap.entrySet();
		
		for(Entry<String, String> e:entries) {
			System.out.println(e);
			System.out.println(e.getKey()+":"+e.getValue());
			//e.setValue("DC");
			//System.out.println(e.getKey()+":"+e.getValue());
			System.out.println("");
			System.out.println("");
		}
		
		Set<String> sk = capitalMap.keySet();
		for(String k:sk) {
			System.out.println(k+":"+capitalMap.get(k));
		}
		
		System.out.println("");
		System.out.println("");
		
		capitalMap.forEach((k,v)->System.out.println(k+":"+v));
		Collection<String> l=capitalMap.values();

		HashMap<String,Integer> marks = new HashMap<>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 500);
		
		//Collections.s
	}

}
