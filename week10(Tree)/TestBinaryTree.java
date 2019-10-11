
public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree Minkinew = new BinaryTree(9, 10);
		System.out.print(" levelorder : ");
		Minkinew.levelorder();
		System.out.print(" preorder : ");
		Minkinew.preorder(0);
		
		System.out.println();
		System.out.println();

		BinaryTree Minkinew2 = new BinaryTree(9);
		System.out.print(" levelorder : ");
		Minkinew2.levelorder();
		System.out.print(" preorder : ");
		Minkinew2.preorder(0);


	}

}
