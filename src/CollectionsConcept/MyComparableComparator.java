package CollectionsConcept;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparableComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2= o2.toString();
		return s2.compareTo(s1);
	}

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparableComparator());
		t.add(new StringBuffer("E"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("D"));
		System.out.println(t);
	}

//	@Override
//	public int compareTo(Object o) {
//		return ((MyComparableComparator) o).compareTo(this);
//	}

	

	

	

}
