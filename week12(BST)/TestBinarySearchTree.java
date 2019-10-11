
public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree minkinew = new BinarySearchTree();
		
		System.out.println("========== »ğÀÔ ==========");
		minkinew.recu_insert(5);
		minkinew.recu_insert(10);
		minkinew.recu_insert(1);
		minkinew.recu_insert(3);
		minkinew.recu_insert(7);
		minkinew.recu_insert(13);
		minkinew.recu_insert(11);
		minkinew.recu_insert(15);
		minkinew.recu_insert(12);
		
		minkinew.inorder();
		System.out.println("");
		System.out.println("========== »èÁ¦ ==========");
		
		minkinew.delete(12);
		minkinew.delete(1); 
		minkinew.delete(10); 
		
		minkinew.inorder();
		

	}

}
