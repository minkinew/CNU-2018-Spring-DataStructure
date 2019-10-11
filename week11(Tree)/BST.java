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
			if (this.key < (int) other) // 오른쪽
				return 1;
			else if (this.key == (int) other)
				return 0;
			else // 왼쪽
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
			if (this.key.compareTo(key) < 0) { // 왼쪽
				if (this.left.key == null)
					this.left = new BST(key);
				else if (!left.recu_insert(key))
					return false;

				left.recu_insert(key);

				this.size++;
			}

			else if (this.key.compareTo(key) > 0) { // 오른쪽
				if (this.right.key == null)
					this.right = new BST(key);
				else if (!right.recu_insert(key))
					return false;

				right.recu_insert(key);

				this.size++;
			}

			else
				return false; // 중복인 경우
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
					return false; // 중복인 경우

				else if (bag.key.compareTo(key) == -1) { // ( 왼쪽 )자신이 key값보다 클 때
					bag = bag.left;
				}

				else if (bag.key.compareTo(key) == 1) { // (오른쪽)자신이 key값보다 작을 때
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
