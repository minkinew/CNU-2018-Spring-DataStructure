public class SLinkedQueue implements Queue {
	private Node front;
	private Node rear;
	private int size;

	private static class Node {
		Object object;
		Node next;

		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}

	@Override
	public void add(Object object) {
		if (size == 0) {
			front = new Node(object, front);
			rear = front;
			size++;
		} else {
			rear.next = new Node(object, null);
			rear = rear.next;
			size++;
		}
	}

	@Override
	public Object remove() {
		if (size == 0) {
			System.out.println("Empty");
			return -1;
		} else {
			Object o = front.object;
			front = front.next;
			--size;
			return o;
		}
	}

	@Override
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

	public String toString() {
		StringBuffer buf = new StringBuffer("SLinkedQueue : ");
		for (Node p = front; p != null; p = p.next) {
			buf.insert(15, Integer.toString((int) p.object) + " ");
		}
		return buf.toString();
	}

	@Override
	public boolean empty() {
		if (size == 0)
			return true;
		else
			return false;
	}
}