package CollectionsConcept;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethods {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		//16 methods
		m.put("A", 100);
		m.put("C", 800);
		m.put("V", 700);
		m.put("10", 500);
		m.put("X", 400);
		m.put("XX", 400);
		
		//Comparator.comparing((m)->m.Entry::getValue);
	
		//1
		System.out.println(m.compute("X", (k, v) -> {
			return v + v;
		}));
		System.out.println(m.compute("10", (k, v) -> {
			return Integer.valueOf(10 * 5);
		}));
		//2
		m.computeIfAbsent("Y", k -> {
			return 100;
		});
		//3
		m.computeIfPresent("A", (k, v) -> {
			return v + v;
		});
		System.out.println(m);
		//4
		m.entrySet();
		Set<Entry<String, Integer>> entrySet =m.entrySet(); 
		for(Entry<String, Integer> e:entrySet) {		
			System.out.println(e.getKey());
			System.out.println(e.getKey());			
			System.out.println(e.setValue(3));
		}
		
		//5
		m.keySet();
		//6
		m.merge("V", 700, (k, v) -> {
			return v + v;
		});
		System.out.println(m);
		//7
		m.putAll(m);
		//8
		m.putIfAbsent("Z", 999);
		m.putIfAbsent("X", 9999);// x already present so it fails
		//9
		m.remove("");
		//10
		m.remove("", 688);
		//11
		m.replace("C", 445);// value is new value
		//12
		m.replace("A", 100, 220);
		//13
		m.replaceAll((k, v) -> {
			return v + v;
		});
		//14
		m.values();
		//15
		m.containsKey("A");
		//16
		m.containsValue(400);
		System.out.println(m);
		/***************************** HashMap *******************************/
		HashMap<String, Integer> hm = new HashMap<>();
		// Same as Map Methods
		/***************************** SortedMap *******************************/
		SortedMap<String, Integer> sm = new TreeMap<>();
		//5 methods
		sm.put("A", 110);
		sm.put("C", 810);
		sm.put("V", 710);
		sm.put("10", 510);
		sm.put("X", 410);
		sm.put("XX", 410);
		//1
		sm.firstKey();
		//2
		sm.lastKey();
		//3
		sm.headMap("10");
		//4
		System.out.println(sm);
		sm.subMap("10", "C");
		//5
		sm.tailMap("C");
		/***************************** NavigableMap *******************************/
		NavigableMap<String, Integer> nm = new TreeMap<>();
		nm.put("A", 110);
		nm.put("C", 810);
		nm.put("V", 710);
		nm.put("10", 510);
		nm.put("X", 410);
		nm.put("XX", 410);
		//1
		//21 methods
		//1
		 nm.ceilingEntry("A");
		//2
		 System.out.println("A's ceiling Key ");
		System.out.println(nm.ceilingKey("A"));
		//3
		 nm.floorEntry("B");  nm.ceilingEntry("");
		//4
		 nm.floorKey("C");   nm.ceilingKey("");
		//5
		 nm.comparator();
		//6
		 nm.descendingKeySet();
		//7
		 nm.descendingMap();
		//8
		 nm.firstEntry();
		//9
		 nm.lastEntry();
		//10
		 nm.firstKey();
		//11
		 nm.lastKey();
		//12
		 nm.headMap("C", true);
		//13
		 System.out.println("B's higher Entry");
		System.out.println(nm.higherEntry("B"));
		 System.out.println("B's higher Entry");
		//14
		 nm.lowerEntry("X");
		//15
		  nm.higherKey("10");
		//16
		 nm.lowerKey("10");
		//17
		 nm.tailMap("C", true);
		//18
		 nm.subMap("C", true, "X", false);
		//19
		 nm.pollFirstEntry();
		//20
		 nm.pollLastEntry();
		//21
		 nm.navigableKeySet();
		
		 /***************************** TreeMap *******************************/
		TreeMap<String, Integer> tm = new TreeMap<>();
		// Same as Map Methods
		
		/***************************** Hashtable *******************************/
		Map<String,Integer> ht = new Hashtable<>();
		// Same as Map Methods
		
		Hashtable<String,Integer> htm = new Hashtable<>();
		// Same as Map Methods
		
		/***************************** Properties *******************************/
		Map p1 = new Properties();
		p1.put("A", 100);
		System.out.println(p1);
		//Map p2 = new Properties(defaults);
		// Same as Map Methods
		
		//comparator
		 Map<String, Integer> sortedData = new HashMap<>();
		 sortedData.put("five", 5);
		    sortedData.put("One", 1);
		    sortedData.put("Two", 2);
		    sortedData.put("Three", 3);

//		    Stream<Map.Entry<String, Integer>> stream = sortedData.entrySet().stream();
//		    List<Integer> sorted = stream
//		            .sorted(Comparator.comparing(Map.Entry::getValue))
//		            .map(Map.Entry::getValue)
//		            .collect(Collectors.toList());
		    
//		    Stream<Map.Entry<String, Integer>> stream = sortedData.entrySet().stream();
//		    Map<String, Integer> sorted = stream
//		            .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue))	            
//		            .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry<String, Integer>::getValue));
	
		    
		    Stream<Map.Entry<String, Integer>> stream = sortedData.entrySet().stream();
		    List<Map.Entry<String, Integer>> sorted = stream
		            .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue))
		            .collect(Collectors.toList());
		    
		    HashMap<String, Integer> SortedHashMap = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : sorted) { 
	        	SortedHashMap.put(aa.getKey(), aa.getValue()); 
	        } 
	        
	        TreeMap<String, Integer> tt= new TreeMap<String, Integer>(SortedHashMap);
	       System.out.println("TreeMap");
	       System.out.println(tt);
	       
		    
	   // .sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue).reversed ())
		   //. sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)))
		    System.out.println(sorted);
		    System.out.println(SortedHashMap);
		    System.out.println(sortedData);
		    
		    
	}

}
