import java.util.*;

public class BinaryTree {
	private int[] tree;
	private int size;

	public BinaryTree(int a) {
		tree = new int[a];
		size = a;
		for (int i = 0; i < size; i++)
			tree[i] = i;
			
	}

	public BinaryTree(int a, int seed) {
		size = a;
		tree = new int[a];
		Random random = new Random();

		for (int i = 0; i < size; i++)
			tree[i] = random.nextInt(seed);
		
	

	}

	public void levelorder() {
		for (int i = 0; i < size; i++) {
			System.out.print(tree[i] + " ");
		}
	}

	public void preorder(int i) {
		if (i > size - 1)
			return;
		else {
			System.out.print(tree[i] + " ");
			preorder(2 * i + 1);
			preorder(2 * i + 2);
		}
	}

}
