package CollectionsConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapIntialization {

	public static Map<String, Integer> marksMap;
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 100);
	}

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<>();
		HashMap<String, Integer> marksHash = new HashMap<>();

		// immutable map with only single entry
		Map<String, Integer> marksHashImmutableSingleton = Collections.singletonMap("AA", 300);
		//marksHashImmutableSingleton.put("B", 200);//not allowed
		
		//JDK 8
		//Creating one 2d array using streams and collectiong in form of Map
		Map<String, String> map4 = Stream.of(new String[][] { {"Tom","A grade"},{"Naveen","A+ grade"},{"Dinakar","B grade"}})
				.collect(Collectors.toMap(data->data[0],data->data[1]));
		
		map4.put("Lisa", "A++ grade");
		
		System.out.println(map4);
		System.out.println(map4.get("Lisa"));
		
		Map<Object, Object> map5 = Stream.of(new Object[][] { {"Tom",133},{"Naveen",144},{"Dinakar",155}})
				.collect(Collectors.toMap(data->data[0],data->data[1]));
		
		//Using SimpleEntry	
		Map<String, String> mapSimpleEntry = Stream.of(new AbstractMap.SimpleEntry<>("Naveen","Java"),
				new AbstractMap.SimpleEntry<>("Tom","Python"))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		//JDK 9 --immutable Maps using Map.of,Map.ofEntries
		
		//Map<String, String> map14 =Map.of();
		//Map.of("k1","v1","k1","v1","k1","v1");//maximum 10 pairs
		
		/*
		 * Map.ofEntries(new AbstractMap.SimpleEntry<>("Tom","Python") ,new
		 * AbstractMap.SimpleEntry<>("Naveen","Java") ,new
		 * AbstractMap.SimpleEntry<>("Dinakar","Java9"));
		 */
		
		//Maps using Guava---add dependency if using maven
		//ImmutableMap.of("Google","Google India","Amazon","Amazon Shopping");	//key ,value ,key, value	

	}

}
