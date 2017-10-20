
public class ArrayQueueImpl {
	
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	boolean isEmpty() {
		return this.front == -1 || this.front >= this.rear;
	}
	
	boolean isFull() {
		return this.rear == this.arr.length;
	}
	int size() {
		return this.arr.length;
	}
	
	void enqueue(int newItem) {
		if (this.front == -1) {
			this.front = 0;
		}
		if (this.isFull()) {
			this.resize(this.arr.length*2);
		}
		this.arr[this.rear++] = newItem;	
	}
	
	int dequeue() throws QueueException {
		if (this.isEmpty()) {
			throw new QueueException("Empty Queue Error!");
		}
		int result = this.arr[this.front++];	
		return result;
	}
	
	int peek() throws QueueException {
		if (this.isEmpty()) {
			throw new QueueException("Empty Queue Error!");
		}
		return this.arr[this.front];
	}
	
	void resize(int size) {
		int[] temp = new int[size];
		for (int i = 0; i < this.arr.length; i++) {
			temp[i] = this.arr[i];
		}
		this.arr = temp;
	}
	
	public int getFront() {
		return this.front;
	}
	
	public int getRear() {
		return this.rear;
	}
}
