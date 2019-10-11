
public class TestBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST minkinew = new BST();
		
		System.out.println("==========recu_insert==========");
		minkinew.recu_insert(5);
		minkinew.recu_insert(10);
		minkinew.recu_insert(1);
		minkinew.recu_insert(3);
		minkinew.recu_insert(7);
		
		minkinew.inorder();
		
		System.out.println();
		System.out.println("==========iter_insert==========");
		
		minkinew.iter_insert(13);
		minkinew.iter_insert(11);
		minkinew.iter_insert(15);
		minkinew.iter_insert(12);
		
		minkinew.inorder();
	}

}
