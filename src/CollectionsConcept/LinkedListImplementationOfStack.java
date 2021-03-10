package CollectionsConcept;

public class LinkedListImplementationOfStack {
	Node head;

	class Node {
		int value;
		Node next;
	}
	
//	LinkedListImplementationOfStack(){
//		   head=null;
//	   }
	
	public void push(int value) {
		Node extraHead = head;
		//Node extraHead = null;
		head = new Node();
		head.value= value;
		head.next = extraHead;
	}
	public int pop() {
		if(head==null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int value=head.value;
		head = head.next;
		return value;
		
	}
	
	public static void printList(Node head) {
		Node temp =head;
		while(temp!=null) {
			System.out.println(temp.value+"  ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListImplementationOfStack lls = new LinkedListImplementationOfStack();
		System.out.println(lls.pop());
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(40);
		lls.push(50);
		System.out.println("element removed.... "+lls.pop());
		printList(lls.head);

	}

}
