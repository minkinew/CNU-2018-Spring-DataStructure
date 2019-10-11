package Minkinew5;

public class ArrayQueue implements Queue {
	private Object[] queue;
	private int front = -1;
	private int rear = -1;
	private int size;

	public ArrayQueue(int n) {
		queue = new Object[n];
	}

	@Override
	public void add(Object object) {
		if (rear == queue.length - 1)
			System.out.println("Full");
		queue[rear + 1] = object;
		rear = rear + 1;
		++size;
	}

	@Override
	public Object remove() {
		if (front == rear)
			System.out.println("Empty");
		Object r = queue[front + 1];
		front = front + 1;
		queue[front] = null;
		return r;
	}

	@Override
	public Object first() {
		if (front == rear)
			System.out.println("Empty");
		Object r = queue[front + 1];
		return r;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean insEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer("ArrayQueue : ");
		for (int i = size - 1; i >= 0; i--) {
			if (queue[i] == null) {
				buf.insert(13, "null ");
			} else
				buf.insert(13, queue[i] + " ");
		}
		buf.insert(0, "\n");
		buf.insert(0, "( front : " + Integer.toString(front) + " , rear : "
				+ Integer.toString(rear) + " )");
		return buf.toString();
	}

}