package CollectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> compMap = new HashMap<>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 12000);
		compMap.put("Amazon", 300000);
		compMap.put("Facebook", 40000);
		compMap.put("Cisco", 50000);
		
		Iterator<Entry<String, Integer>> it = compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry =it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

		//convert hashmap keys to ArrayList
		List<String> keysList = new ArrayList<>(compMap.keySet());
		System.out.println(keysList);
		
		List<Integer> valuesList = new ArrayList<>(compMap.values());
		System.out.println(valuesList);
		
		
//		LinkedList<String> lstr = new LinkedList<String>();
//		lstr.descendingIterator();
		
		
	}

}
