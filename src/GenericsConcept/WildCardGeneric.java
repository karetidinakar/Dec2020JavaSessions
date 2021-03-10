package GenericsConcept;

import java.util.ArrayList;

import CollectionsConcept.CopyonWriteAlASChildThread;

public class WildCardGeneric {

	public static void m1(ArrayList<?> l) {
		// l.add("A");//error
		// l.add(1);//error
		l.add(null);
		System.out.println(l);
	}

	public static void m2(ArrayList<? extends Number> l) {
		// l.add("A");//error
		// l.add(1);//error
		l.add(null);
		System.out.println(l);
	}

	public static void m3(ArrayList<? super Number> l) {
		// l.add("A");//error
		// l.add(new Object());
		l.add(1);
		l.add(1.1);
		l.add(null);
		System.out.println(l);
	}

	public static void m5(ArrayList<? super Integer> l) {
		// l.add("A");//error
		// l.add(new Object());//error
		l.add(1);
		// l.add(1.1);//error
		l.add(null);
		System.out.println(l);
	}

	public static void m4(ArrayList<? super Runnable> l) {
		// l.add("A");//error
		// l.add(1);//error
		// l.add(new Object());//error
		l.add(new Thread());
		l.add(null);
		System.out.println(l);
	}

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		m1(ls);

		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		m2(li);

		ArrayList<Object> lo = new ArrayList<>();
		lo.add(new Object());
		// lo.add(new Number());//Number is abstract class, cannot create object
		m3(lo);

		ArrayList<Object> lor = new ArrayList<>();
		lor.add(new Object());
		lor.add(new CopyonWriteAlASChildThread());// extends Thread
		m4(lor);

		ArrayList<Object> loi = new ArrayList<>();
		loi.add(new Object());
		loi.add(1.1);
		// loi.add(new Number());//Number is abstract class, cannot create object
		m5(loi);

		// ArrayList<Object> al= new ArrayList<String>(); //Polymorphism not allowed at
		// parameter type level
		ArrayList al1 = new ArrayList<String>();
		al1.add(1);// reference is considered

		ArrayList<String> al2 = new ArrayList<>();
		// al2.add(1);//reference is considered so error
		al2.add("A");// reference is considered

		ArrayList al3 = new ArrayList<Integer>(); // same as al1 since only reference considered
		al3.add("A");
		al3.add(1);
		al3.add(1.1);
		
		
	}

}
