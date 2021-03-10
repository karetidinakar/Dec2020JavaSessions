package CollectionsConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		HashMap<String, String> marksHash = new HashMap<>();
		marksHash.put("Naveen", "1");
		marksHash.put("Tom", "2");
		marksHash.put("Lisa", "3");
		
		//Crating Synchronized map
		
		Map<String, String> marksHashSync=Collections.synchronizedMap(marksHash);
		
		
		//ConcurrentHashMap
		ConcurrentHashMap<String, String> ConcurrentmarksHash = new ConcurrentHashMap<>();
		ConcurrentmarksHash.put("Naveen", "1");
		ConcurrentmarksHash.put("Tom", "2");
		ConcurrentmarksHash.put("Lisa", "3");

	}

}
