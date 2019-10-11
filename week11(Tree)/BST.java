public class BST {
	private Comparable key;
	private BST left;
	private BST right;
	private int size;

	private class Node implements Comparable {
		public int key;

		public Node(int key) {
			this.key = key;
		}

		@Override
		public int compareTo(Object other) {
			if (this.key < (int) other) // ������
				return 1;
			else if (this.key == (int) other)
				return 0;
			else // ����
				return -1; 
		}
	}

	public BST() {
		this.key = null;
		this.left = null;
		this.right = null;
		this.size = 0;
	}

	public BST(int key) {
		this.key = new Node(key);
		this.left = new BST();
		this.right = new BST();
		this.size = 1;
	}

	public int treesize() {
		return size;
	}

	public boolean recu_insert(int key) {
		if (this.key == null) {
			this.key = new Node(key);
			this.left = new BST();
			this.right = new BST();
			this.size = 1;
			return true;
		} 
		else {
			if (this.key.compareTo(key) < 0) { // ����
				if (this.left.key == null)
					this.left = new BST(key);
				else if (!left.recu_insert(key))
					return false;

				left.recu_insert(key);

				this.size++;
			}

			else if (this.key.compareTo(key) > 0) { // ������
				if (this.right.key == null)
					this.right = new BST(key);
				else if (!right.recu_insert(key))
					return false;

				right.recu_insert(key);

				this.size++;
			}

			else
				return false; // �ߺ��� ���
		}
		return true;
	}

	public boolean iter_insert(int key) {
		BST bag = this;

		while(true) {
			if (bag.key == null)
				break;
			else {
				if (bag.key.compareTo(key) == 0)
					return false; // �ߺ��� ���

				else if (bag.key.compareTo(key) == -1) { // ( ���� )�ڽ��� key������ Ŭ ��
					bag = bag.left;
				}

				else if (bag.key.compareTo(key) == 1) { // (������)�ڽ��� key������ ���� ��
					bag = bag.right;
				}
			}
		}

		bag = this;

		while(true) {
			if (bag.key == null)
				break;
			else {
				if (bag.key.compareTo(key) < 0) {
					bag.size++;
					bag = bag.left;
				}

				else if (bag.key.compareTo(key) > 0) {
					bag.size++;
					bag = bag.right;
				}
			}
		}
		bag.key = new Node(key);
		bag.left = new BST();
		bag.right = new BST();
		bag.size = 1;

		return true;
	}

	public void inorder() {
		Node KEY = (Node) key;

		if (left.key != null)
			this.left.inorder();

		System.out.println("Visited : " + KEY.key + " , TreeSize :  " + size);

		if (right.key != null)
			this.right.inorder();

	}

}
