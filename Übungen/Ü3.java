package �bungen;

import java.util.InputMismatchException;

public class �3 {
	public static void main(String[] args) {
	
		�3 �3 = new �3();
		�3.a01();
		System.out.println("all done");
	}
	
	private void a01() {
		
	int a=1, b=0, c ;
	
	while(true) {
		try {
			c= a/b;
			break;
		}
		catch (InputMismatchException error) {
			System.out.println("the answer is 0");
		}
	}
		
	System.out.println("c: " +c);
	
	}
	private void a02() {
		int [] ar = new int[3];
		ar[0]= 100;
		int c = ar[0];

}
}
