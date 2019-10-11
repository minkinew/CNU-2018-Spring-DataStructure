package Minkinew2;

public class TedtLinkedList {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list1.insertfirst(i+1);
		}
		
		list1.print();
		System.out.println(list1.contain(5));
		System.out.println(list1.contain(20));
		
		
		LinkedList list2 = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list2.insertlast(i+1);
		}
		list2.print();
	}
}
