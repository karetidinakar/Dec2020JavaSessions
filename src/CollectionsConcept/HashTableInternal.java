package CollectionsConcept;

import java.util.Hashtable;

public class HashTableInternal {
//Default Capacity=11;
	public static void main(String[] args) {
		Hashtable<String,Integer> h = new Hashtable();
		h.put("Naveen", 100);
		h.put("Lisa", 200);
		h.put("Peter", 300);
		h.put("Robby", 400);
		h.put("Dinakar", 600);
		//h.put("Dinakar Yadav", null);-->not allowed,gets exception at runtime
		

	}

}
