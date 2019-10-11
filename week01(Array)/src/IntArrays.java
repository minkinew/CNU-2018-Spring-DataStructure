import java.util.Arrays;
import java.util.Random;

public class IntArrays {

	int[] Beyul; 
	int Size; 

	public IntArrays(int b) { 
		Random B = new Random(); 
		Beyul = new int[b]; 
		for (int i = 0; i < b / 2; i++) {
			Beyul[i] = B.nextInt(10) + 1; 
		}
		Size = b / 2;
		System.out.println("길이" + Beyul.length + "인 배열을 생성하였습니다.");
	}

	public void print() {
		for (int i = 0; i < Beyul.length; i++) {
			System.out.print(Beyul[i]+" ");
		}
		System.out.println(" ");
	}

	public void add(int F) {
		Beyul[Size]=F;
		Size++;
		if (Size == 10) {
			int[] b = Beyul;
			Beyul = new int[2 * b.length];
			System.arraycopy(b, 0, Beyul, 0, Size);
		}
	}
	

	public void remove(int c) {
		for(int i = 0; i<Beyul.length; i++){
			if(Beyul[i]==c){
				int n = c;
						System.arraycopy(Beyul, i+1, Beyul, i, Beyul.length-i-1);
			}
		}
	}
}

