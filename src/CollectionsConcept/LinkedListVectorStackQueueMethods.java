package CollectionsConcept;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class LinkedListVectorStackQueueMethods {

	public static void main(String[] args) {
		// 19 methods
		LinkedList<String> l = new LinkedList<>();
		l.addFirst("200");
		l.addLast("20");
		l.getFirst();
		l.getLast();
		l.removeFirst();
		l.removeLast();
		l.removeFirstOccurrence("");
		l.removeLastOccurrence("");
		l.descendingIterator();	
		l.offer("50");
		l.offerFirst("40");
		l.offerLast("99");
		l.peek();
		l.peekFirst();
		l.peekLast();
		l.poll();
		l.pollFirst();
		l.pollLast();
		l.pop();
		l.push("66");
		

		// 16 methods
		Vector<String> v = new Vector<>();
		v.addElement("12");
		String[] s = new String[v.size()];
		v.copyInto(s);
		v.elementAt(3);
		v.elements();
		v.listIterator(6);
		v.capacity();
		v.ensureCapacity(10);
		v.firstElement();
		v.lastElement();
		v.insertElementAt("13", 5);
		v.removeAllElements();
		v.removeElement("12");
		v.removeElementAt(1);
		v.setElementAt("14", 5);
		v.setSize(20);
		v.trimToSize();
		
		Stack<String> st = new Stack<>();
		st.peek();
		st.push("");
		st.pop();
		st.search("");//returns offset -->starts from top with 1;

		
		// same as inherited class and Interface
	
		// 13 methods
		Queue<String> pq = new PriorityQueue<>();
		pq.offer("");
		pq.peek();
		pq.poll();
		pq.remove();// removes head
		pq.element();// returns but not remove the head
		//and  collection interface methods
		
		
		Queue<String> llq = new LinkedList<>();
		llq.offer(null);
		System.out.println("PriorityQueue");
		System.out.println(llq);
		//only collection interface methods
		
//		Comparator<Employee> employeeNameComparator
//	      = Comparator.comparing(Employee::getName);
//	    
//	    Arrays.sort(employees, employeeNameComparator);
//	    
//	    [Employee(name=John, age=25, salary=3000.0, mobile=9922001), 
//	     Employee(name=Ace, age=22, salary=2000.0, mobile=5924001), 
//	     Employee(name=Keith, age=35, salary=4000.0, mobile=3924401)]

	}

}
