package CollectionsConcept;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWArraylist {

	public static void main(String[] args) {
		CopyOnWriteArrayList cal= new CopyOnWriteArrayList();//Adding after iterator not shown in output
		//ArrayList cal= new ArrayList(); //Adding after iterator no response
		cal.add("A");
		cal.add("B");
		cal.add("C");
		Iterator it = cal.iterator();
		cal.add("E");
		//ListIterator it = cal.listIterator();		cal.add("D");//Adding element after Iterator 
		while(it.hasNext()) {
			
			String s=(String)it.next();//java.util.ConcurrentModificationException for ArrayList
			//it.add("S");//not allowed for CopyOnWriteArrayList iterator //java.lang.UnsupportedOperationException
			if(s.equals("C")){
				it.remove();//not allowed for CopyOnWriteArrayList iterator  //java.lang.UnsupportedOperationException
			}
		}
		System.out.println(cal);
	}

}
