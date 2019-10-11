import java.util.*;

public class OrderedTree {
	private Object root;
	private List subtrees;
	private int size;

	public OrderedTree() {
	}

	public OrderedTree(Object root) {
		this.root = root;
		subtrees = new LinkedList();
		size = 1;
	}

	public OrderedTree(Object root, List trees) {
		this(root);
		for (Iterator it = trees.iterator(); it.hasNext();) {
			Object object = it.next();
			if (object instanceof OrderedTree) {
				OrderedTree tree = (OrderedTree) object;
				subtrees.add(tree);
				size = size + tree.size();
			}
		}
	}

	public int size() {
		return size;
	}

	public void levelorder() {
		Queue q = new ArrayQueue();
		q.add(this);

		while (q.size() != 0) {
			OrderedTree p = (OrderedTree) q.remove();
			System.out.print(p.root.toString() + " ");

			for (Iterator it = p.subtrees.iterator(); it.hasNext();) {
				Object object = it.next();
				if (object instanceof OrderedTree) {
					OrderedTree tree = (OrderedTree) object;
					q.add(tree);
				}
			}
		}
	}

}
