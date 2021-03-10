package CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapConcept extends Thread {
	static ConcurrentHashMap cal = new ConcurrentHashMap();// Adding after Iterator will not displayed in output
	// static HashMap cal = new HashMap();//Adding after iterator no response

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		cal.put("D", 1);
	}

	public static void m1(ArrayList<String> as) {

	}
//
//	public static void m1(ArrayList<Integer> ai) {
//
//	}
//	
//	ArrayList<Object> as = new ArrayList<String>();

	public static void main(String[] args) {

		cal.put("A", 5);
		cal.put("B", 4);
		cal.put("C", 3);
		// cal.putIfAbsent(key, value)
		Set set = cal.keySet();
		Iterator it = set.iterator();
		// cal.add("E");//Adding after Iterator will not displayed in output
		ConcurrentHashMapConcept t = new ConcurrentHashMapConcept();
		t.start();
		while (it.hasNext()) {
			String s = (String) it.next();// java.util.ConcurrentModificationException for HashMap
			// System.out.println(it.next());//java.util.ConcurrentModificationException for
			// HashMap
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}

		System.out.println(cal);
	}

}
