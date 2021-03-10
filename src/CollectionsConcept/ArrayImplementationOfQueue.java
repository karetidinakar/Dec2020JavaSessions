package CollectionsConcept;

public class ArrayImplementationOfQueue {

	int capacity;
	int rear;
	int front;
	int[] queueArray;
	int curentSize;
	
	public ArrayImplementationOfQueue(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		this.front=0;
		this.rear=-1;
		queueArray = new int[sizeOfQueue];		
	}
	public boolean isFull() {
		if (capacity ==curentSize)
			return true;
		else 
			return false;
	}
	public boolean isEmpty() {
		if (capacity ==0)
			return true;
		else 
			return false;
	}
	public void enqueue(int data) {
		if(isFull()==true) {
			System.out.println("Queue is full,cannot insert the data");
		}else {
			rear++;
			if(rear==capacity-1) {
				rear=0;
			}
			queueArray[rear]=data;
		}
		
	}
	public void dequeue(int data) {
		if(isEmpty()==true) {
			System.out.println("Queue is Empty");
		}else {
			front--;
			if(front==capacity-1) {
				System.out.println(queueArray[front-1]+" element removed");
				front=0;
			}else {
				System.out.println(queueArray[front-1]+" element removed");
			}
			curentSize--;
		}
		
	}
	public static void main(String[] args) {
		

	}

}
