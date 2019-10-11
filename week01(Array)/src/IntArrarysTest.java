public class IntArrarysTest {

	public static void main(String[] args) {
		IntArrays A = new IntArrays(10);
		A.print();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		A.print();
		
		A.remove(1);
		A.remove(3);
		A.remove(7);
		A.print();
	}

}
