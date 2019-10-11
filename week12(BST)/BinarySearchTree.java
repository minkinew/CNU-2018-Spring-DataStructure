public class BinarySearchTree {
	private Comparable key;
	private BinarySearchTree left;
	private BinarySearchTree right;
	private int size;

	private class Node implements Comparable {
		public int key;

		public Node(int key) {
			this.key = key;
		}

		@Override
		public int compareTo(Object other) {
			if (this.key < (int) other)
				return 1;
			else if (this.key == (int) other)
				return 0;
			else
				return -1;
		}
	}

	public BinarySearchTree() {
		this.key = null;
		this.left = null;
		this.right = null;
		this.size = 0;
	}

	public BinarySearchTree(int key) {
		this.key = new Node(key);
		this.left = null;
		this.right = null;
		this.size = 1;
	}

	public int treesize() {
		return size;
	}

	public boolean recu_insert(int key) {
		if (this.key == null) {
			this.key = new Node(key);
			this.left = null;
			this.right = null;
			this.size++;
			return true;
		} 
		
		else if (this.key.compareTo(key) > 0) { // ¿À¸¥ÂÊ
				if (this.right != null){
					if (!right.recu_insert(key))
						return false;
				}
				else 
					this.right = new BinarySearchTree(key);
					this.size++;
			}
		
		else if (this.key.compareTo(key) < 0) { // ¿ÞÂÊ
			if (this.left != null) {
				if (!left.recu_insert(key))
					return false;
			} 
			else
				this.left = new BinarySearchTree(key);
			this.size++;
		}
	
		else if (this.key.compareTo(key) == 0)
				return false; 
	
		return true;
		
}

	public void inorder() {
		Node KEY = (Node) key;

		if (left != null && left.key != null)
			this.left.inorder();

		System.out.println("Visited : " + KEY.key + " , TreeSize :  " + size);

		if (right != null && right.key != null)
			this.right.inorder();

	}

	public boolean delete(Comparable key) {
		if (this.key == null) {
			return false;
		} 

		else if (this.key.compareTo(key) > 0) {
			if (this.right != null) {
				if (!this.right.delete(key)){
				return false;
			} 
				this.size--;
				
				return true;
			}
		}
		
		else if (this.key.compareTo(key) < 0) {
			if (this.left != null) {
				if (!this.left.delete(key))
					return false;
			
				this.size--;
				
				return true;
			}
		}
		
		else if (this.key.compareTo(key) == 0){
			if ((this.left == null) && (this.right == null)){
				this.key = null;
				return true;
			}
			else if ((this.left == null) && (this.right != null)){
				BinarySearchTree t = this.right;
				this.key = t.key;
				this.left = t.left;
				this.right = t.right;
				t = null;
				
				this.size--;
				return true;
			}
			else if ((this.left !=null) && (this.right == null)){
				BinarySearchTree e = this.left;
				this.key = e.key;
				this.left = e.left;
				this.right = e.right;
				e = null;
				
				this.size--;
				return true;
			}
			else if ((this.left != null) && (this.right != null)){
				this.key = delete_minimum(this.right);
				
				return true;
			}
		}
		
			return false;	
	}

	public Comparable delete_minimum(BinarySearchTree T) {
		BinarySearchTree m = this;
		BinarySearchTree p = T;

		if (p.left == null) {
			m.key = p.key;
			m.right = p.right;
			m.size--;
			return T.key;
		}
		
		else if (p.left != null) {
			p = p.left;
			m = m.right;
			
			while (p.left != null){
				p = p.left;
				m = m.left;
			}
			
			this.key = p.key;
			this.size--;
			
			if (p.right != null){
				m.left.key = p.right.key;
				m.left = p.right;
				m.size--;
			}
			else if (p.right == null){
				m.left = null;
				m.size--;
			}
			System.out.println("* Alternative Node : " + ((Node)key).key);
			return this.key;
		}
		
		
		return key;
	}
}
