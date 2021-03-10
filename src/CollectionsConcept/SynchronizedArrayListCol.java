package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListCol {

	public static void main(String[] args) {
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		
		nameList.add("java");
		nameList.add("python");
		nameList.add("javascript");
		
		//Iterator it = nameList.iterator();
		//synchronized (it) {
		Iterator it = nameList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				//nameList.add("C");
			}
		//}
		
		CopyOnWriteArrayList<String> cow = new CopyOnWriteArrayList<>();
		cow.add("javac");
		cow.add("pythonc");
		cow.add("javascriptc");
		
		Iterator itc = cow.iterator();
		while(itc.hasNext()) {
			System.out.println(itc.next());
			cow.add("CC");
		}
		
	}

}
