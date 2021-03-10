package JavaSessions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("A", "a");
		m.put("B", "b");
		m.put("C", "c");
		m.put("D", "d");
		m.put("E", "e");
		
		Iterator<Map.Entry<String,String>> it = m.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*******************");
		for(Entry<String,String> es:m.entrySet()) {
			System.out.println(es.getKey()+" "+":"+" "+es.getValue());
		}

	}

}
