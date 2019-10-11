package Minkinew5;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayQueue n = new ArrayQueue(10);
		
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		
		System.out.println(n.toString());
		System.out.println("");
		
		n.remove();
		n.remove();
		
		System.out.println(n.toString());
		System.out.println("");
		
		SLinkedQueue m = new SLinkedQueue();
		
		m.add(6);
		m.add(7);
		m.add(8);
		m.add(9);
		
		System.out.println(m.toString());
		System.out.println("");
		
		m.remove();
		m.remove();
		m.remove();
		m.remove();
		
		System.out.println(m.toString());
		System.out.println("");
		
		m.add(10);
		m.add(11);
		m.add(12);
		
		System.out.println(m.toString());
		System.out.println("");
		
		
		System.out.println("[Change from SLinked_Q to Array_Q]");
		ArrayQueue l = m.toarrayQueue();
		System.out.println(l.toString());
		

	}

}
