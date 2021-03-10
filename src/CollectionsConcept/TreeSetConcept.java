package CollectionsConcept;

import java.util.TreeSet;

public class TreeSetConcept {
///java.lang.StringBuffer cannot be cast to java.lang.Comparable
	public static void main(String[] args) {
//		TreeSet t = new TreeSet();
//		t.add(new StringBuffer("A"));
//		t.add(new StringBuffer("B"));
//		t.add(new StringBuffer("C"));
//		t.add(new StringBuffer("D"));
//		System.out.println(t);
		
//		java.lang.StringBuilder cannot be cast to java.lang.Comparable
//		TreeSet ts = new TreeSet();
//		ts.add(new StringBuilder("A"));
//		ts.add(new StringBuilder("B"));
//		ts.add(new StringBuilder("C"));
//		ts.add(new StringBuilder("D"));
//		System.out.println(ts);
		
		TreeSet tss = new TreeSet();
		tss.add(new String("A"));
		tss.add(new String("B"));
		tss.add(new String("C"));
		tss.add(new String("D"));
		System.out.println(tss);

	}

}
