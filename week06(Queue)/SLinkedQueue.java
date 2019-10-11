package Minkinew5;

public class SLinkedQueue {
	private Node front;
	private Node rear;
	private int size;

	private static class Node {
		Object object;
		Node next;

		Node() {

		}

		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}

	public void add(Object object) {
		if (size == 0) {
			front = new Node(object, front);
			rear = front;
			size++;
		} else {
			rear.next = new Node(object, rear.next);
			rear = rear.next;
			size++;
		}
	}

	public Object remove() {
		if (size == 0)
			System.out.println("Empty");
		else {
			Node p = new Node();
			p = front;
			front = front.next;
			--size;
		}
		return null;
	}

	public Object first() {
		if (size == 0)
			System.out.println("Empty");
		else
			return front.object;
		return null;
	}

	public int size() {
		return size;
	}

	public boolean isempty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	ArrayQueue toarrayQueue() {
		ArrayQueue l = new ArrayQueue(10);
		for (Node p = front; p != null; p = p.next) {
			l.add(p.object);
		}
		return l;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer("SLinkedQueue : ");
		for (Node p = front; p != null; p = p.next) {
			buf.insert(15, Integer.toString((int) p.object) + " ");
		}
		return buf.toString();
	}
}
