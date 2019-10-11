package Minkinew3;

public class TestBigInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInt x = new BigInt(54321);
		BigInt y = new BigInt(9);
		BigInt z = new BigInt(8888);
		x.toString();
		z.toString();
		
		System.out.println("[ x : 54321 , y : 9 ]");
		System.out.println("x.multiplyone(y) = " + x.multiplyone(y));
		
		System.out.println("[ x : 54321 , z : 8888 ]");
		System.out.println("x.multiply(z) = " + x.multiply(z));
		System.out.println("z.multiply(x) = " + z.multiply(x));
		
		x = new BigInt(8888);
		z = new BigInt(54321);
		
		System.out.println("[ x : 8888 , z : 54321 ]");
		System.out.println("x.multiply(z) = " + x.multiply(z));
		System.out.println("z.multiply(x) = " + z.multiply(x));

	}

}
