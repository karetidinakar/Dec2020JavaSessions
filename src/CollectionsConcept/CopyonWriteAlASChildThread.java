package CollectionsConcept;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteAlASChildThread extends Thread {

	static CopyOnWriteArrayList cal = new CopyOnWriteArrayList();//Adding after iterator not shown in output

	//static CopyOnWriteArraySet cal = new CopyOnWriteArraySet();//Adding after iterator not shown in output
	   //static ArrayList cal = new ArrayList();//Adding after iterator no response 

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		cal.add("D");
	}

	public static void main(String[] args) {

		cal.add("A");
		cal.add("B");
		cal.add("C");
		//cal.addAllAbsent(c)
		//cal.addIfAbsent(e)
		Iterator it = cal.iterator();
	//	cal.add("E");//Adding after Iterator will not displayed in output
		CopyonWriteAlASChildThread t = new CopyonWriteAlASChildThread();
		t.start();
		while (it.hasNext()) {
			String s = (String) it.next();//java.util.ConcurrentModificationException for ArrayList
			//System.out.println(it.next());//java.util.ConcurrentModificationException for ArrayList
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}

		System.out.println(cal);
	}

}
