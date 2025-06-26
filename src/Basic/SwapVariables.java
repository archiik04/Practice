package Basic;

public class SwapVariables {

	public static void main(String[] args) {
		int a = 2;
		int b =3;
		int swap;
		System.out.println("Before swap : a, b = " + a + ", " + b);
		
		swap = a;
		a = b;
		b = swap;
		System.out.println("After swap : a, b = " + a + ", " + b);

	}

}
