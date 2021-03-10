package CollectionsConcept;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueConstNull {
//PriorityQueue-->null not allowed
	/// Duplicate allowed
	// insertion order preserved
	// homogeneous
	public static void main(String[] args) {
		Queue llq = new PriorityQueue();
		//Queue llq = new PriorityQueue<>(collection)
		//Queue llq = new PriorityQueue<>(sortedset)
		//Queue llq = new PriorityQueue<>(PriorityQueue)
		//Queue llq = new PriorityQueue<>(initial capacity)
		//Queue llq = new PriorityQueue<>(comparator)
		//Queue llq = new PriorityQueue<>(initialCapacity, comparator)
								
		llq.offer("A");
		llq.offer("A");
		llq.offer("B");
		llq.offer("Z");
		
		//llq.offer(1);
		System.out.println("PriorityQueue");
		System.out.println(llq);

	}

}
