package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionListAl {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		c.add("E");

		String[] sArray = new String[c.size()];
		c.toArray(sArray);

		for (String s : sArray) {
			System.out.println(s);
		}

		Collection<String> c1 = new ArrayList<String>();
		c1.add("AA");
		c1.add("BB");
		c1.add("CC");
		c1.add("DD");
		c1.add("EE");
		
		//String[] s1 = new String[c1.size()];

		for (Object o : c1.toArray()) {
			System.out.println((String)o);
		}
		
		c.addAll(c1);
		System.out.println(c);
		System.out.println(c.toString().replace("[", "").replace("]", ""));//A, B, C, D, E, AA, BB, CC, DD, EE
		
		//c.stream().forEach(a->System.out.println(a.length()));
		
		//c.stream().forEach(System.out::print);
		
		List<String> l1 = new ArrayList<>();
		l1.add(0,"AAA");
		l1.add(1,"BBB");
		l1.add(2,"CCC");
		l1.add(3,"DDD");
		l1.add(4,"EEE");
		
		List<String> l2 = new ArrayList<>();
		l2.addAll(0,l1);
		l2.add(0,"ss");
		System.out.println(l2);
		System.out.println(l2.subList(2, 4));
		l2.replaceAll(a->a.toLowerCase());
		System.out.println(l2);
		
		UnaryOperator<Integer> ui = x->x*10;
		System.out.println(ui.apply(20));
		
		UnaryOperator<String> us = x->x.concat(" Hi");
		l2.replaceAll(us);
		System.out.println(l2);
		
		Predicate<String> ps = x->x.length()<6;
		l2.removeIf(ps);
		System.out.println(l2);
		
		l2.add(4, "Dfg");
		l2.addAll(1, l1);
		l2.remove(1);	
		l2.get(2);
		l2.set(2, "xxy Hello");
		System.out.println(l2);
		l2.indexOf("BBB");
		l2.lastIndexOf("BBB");
		//l2.listIterator();
		System.out.println("Here.........");
		Consumer<String> cs = xx->System.out.println(xx.contains("D"));
		//l2.forEach(cs);
				
		Comparator<String> cmp = (x,y)->x.length()>y.length()?1:x.length()<y.length()?-1:0;
		l2.sort(cmp);
		System.out.println(l2);
		System.out.println(l2.removeIf(x->x.contains("[")));//false
		System.out.println(l2);
		
		
		
	}
	

	

}
