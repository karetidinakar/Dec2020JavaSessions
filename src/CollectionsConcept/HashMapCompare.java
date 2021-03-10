package CollectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
//node(key,hashcode,value,next or null)
	//get method uses equals() by comparing both hashcode and Key 
	//and then gets value
	
	
	//hashcode of null is always "0";then index is also zero
	public static void main(String[] args) {
		HashMap<Integer, String> hs1 = new HashMap<Integer, String>();
		hs1.put(1, "A");
		hs1.put(2, "B");
		hs1.put(3, "C");

		HashMap<Integer, String> hs2 = new HashMap<>();
//		hs2.put(3,"C");
//		hs2.put(1,"A");
//		hs2.put(2,"B");

		hs2.put(1, "A");
		hs2.put(2, "B");
		hs2.put(3, "C");

		HashMap<Integer, String> hs3 = new HashMap<>();
		hs3.put(1, "C");
		hs3.put(2, "A");
		hs3.put(3, "B");
		hs3.put(3, "D");

		System.out.println(hs1.equals(hs2));// true
		System.out.println(hs1.equals(hs3));// false

		System.out.println(hs1.keySet().equals(hs2.keySet()));// true
		System.out.println(hs1.keySet().equals(hs3.keySet()));// true

		// find extra key
		HashMap<Integer, String> hs4 = new HashMap<Integer, String>();
		hs4.put(1, "A");
		hs4.put(2, "B");
		hs4.put(3, "C");
		hs4.put(4, "C");

		HashSet<Integer> combinedKeys = new HashSet<>();

		combinedKeys.addAll(hs4.keySet());
		combinedKeys.removeAll(hs1.keySet());
		System.out.println(combinedKeys);// [4]

		// compare map by values
		HashMap<Integer, String> hs5 = new HashMap<Integer, String>();
		hs5.put(1, "A");
		hs5.put(2, "B");
		hs5.put(3, "C");

		HashMap<Integer, String> hs6 = new HashMap<>();
		hs6.put(4, "A");
		hs6.put(5, "B");
		hs6.put(6, "C");

		HashMap<Integer, String> hs7 = new HashMap<>();
		hs7.put(1, "A");
		hs7.put(2, "B");
		hs7.put(3, "C");
		hs7.put(4, "C");

		// Duplicates not allowed:using arrayList
		System.out.println((new ArrayList<>(hs5.values())).equals(new ArrayList<>(hs6.values())));//true
		System.out.println((new ArrayList<>(hs5.values())).equals(new ArrayList<>(hs7.values())));//false

		// Duplicates allowed:using arrayList
		System.out.println((new HashSet<>(hs5.values())).equals(new HashSet<>(hs6.values())));//true
		System.out.println((new HashSet<>(hs5.values())).equals(new HashSet<>(hs7.values())));//true

	}

}
