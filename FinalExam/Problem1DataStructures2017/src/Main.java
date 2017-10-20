
public class Main {

	public static void main(String[] args) throws QueueException {
		// TODO Auto-generated method stub
		ArrayQueueImpl queue = new ArrayQueueImpl();
		queue.enqueue(3);
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.enqueue(7);
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.enqueue(9);
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.dequeue();
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.enqueue(8);
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.dequeue();
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.dequeue();
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		queue.dequeue();
		System.out.println("F=" + queue.getFront() +", R=" + queue.getRear());
		
	}
	
	

}
