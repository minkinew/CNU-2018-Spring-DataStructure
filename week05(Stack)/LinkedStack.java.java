package Minkinew4;

public class LinkedStack {
	private Node top = new Node();
	private int size;

	public LinkedStack() {
		top = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	private static class Node {
		Object object;
		Node next;

		public Node(){
			
		}
		
		public Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}
	
	public int size() {
		return size;
	}

	public void push(Object object) {
		top = new Node(object,top);
		++size;
	}

	public Object pop() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		Object oldTop = top.object;
		top = top.next;
		--size;
		return oldTop;
	}

	public Object peek() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		return top.object;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(Integer.toString((int)top.object));
		Node p = top.next;
		while (p != null) {
			buf.insert(0,Integer.toString((int)p.object)+" ");
			p = p.next;
		}
		return buf.toString();
	}

	public Object removesecond() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		Object oldTop2 = top.next.object;
		top.next = top.next.next;
		--size;
		return oldTop2;
	}
	
	public void reverse(){
		Node p = top;
		for (int i = 1; i < size; i++){
			Node q =p.next;
			p.next = q.next;
			q.next = top;
			top = q;
			
		}
	}
}
