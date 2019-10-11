package Minkinew4;

public class TestLinkedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack minkinew = new LinkedStack();

		for (int i = 1; i < 6; i++) {
			minkinew.push(i);
		}
		
		System.out.println("Current Elements of Stack : " + minkinew.toString());
		
		minkinew.removesecond();
		System.out.println("removesecond()");
		System.out.println("Removed Node : 4");
		System.out.println("Current Elements of Stack : " + minkinew.toString());
	
		minkinew.reverse();
		System.out.println("reverse()");
		System.out.println("Current Elements of Stack : " + minkinew.toString());
		
	}
	
}
