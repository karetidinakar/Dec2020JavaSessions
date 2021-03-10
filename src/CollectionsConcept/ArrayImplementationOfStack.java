package CollectionsConcept;

//Time Complexity of all below operations is BigO(1);
//push
//pop--return and remove top element
//isFull
//isEmpty
//peek--only return top element
public class ArrayImplementationOfStack {
	int size;
	int[] arr;
	int top;

	ArrayImplementationOfStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public Boolean isFull() {
		return  (top == size - 1);
	}

	public Boolean isEmpty() {
		return (top == -1);
	}

	public int peek() {
		if (!this.isEmpty()) {
			System.out.println("top popped element is.."+arr[top]);
			return arr[top];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public void push(int element) {
		if (!this.isFull()) {
			top = top + 1;			
			arr[top] = element;
		} else {
			System.out.println("Stack is Full");
		}
	}

	public int pop() {
		if (!this.isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("top popped element is.."+arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public static void main(String[] args) {
		ArrayImplementationOfStack asi = new ArrayImplementationOfStack(10);
		asi.pop();
		asi.push(100);
		asi.push(200);
		asi.push(300);
		asi.push(400);
		asi.peek();	
		System.out.println(asi.size);
		asi.pop();
		System.out.println(asi.size);
		System.out.println(asi.isEmpty());
		System.out.println(asi.isFull());
		
	}

}
