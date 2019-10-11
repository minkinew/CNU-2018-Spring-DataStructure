package Minkinew2;

public class LinkedList {
	Node startNode = new Node();

	public LinkedList() {
	}

	public void insertfirst(int x) {
		if (startNode.Value() == 0) {
			startNode.setValue(x);
		} else {
			Node N = new Node(x); // x�� �޴� ���N ����
			N.setNext(startNode);
			startNode = N;
		}
	}

	public void insertlast(int x) {
		if (startNode.Value() == 0) {
			startNode.setValue(x);
		} 
		else {
			Node p = startNode;
			while (p.Next() != null) {
				p = p.Next();
			}
			p.setNext(new Node(x)); 
		}
	} // ���� ��尪�� �����Ⱚ�� �ƴϸ� ��� �־��.

	public boolean contain(int x) {
		Node p = startNode;
		while (p.Next() != null) {
			if (p.Value() == x) {
				return true;
			} else {
				p = p.Next();
			}
		}
		return false;
	}

	public void print() {
		for (Node m = startNode; m != null; m = m.Next())
			System.out.print(m.Value() + " ");
		System.out.println(" ");
	}
}