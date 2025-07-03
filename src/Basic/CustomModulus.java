package Basic;

import java.util.Scanner;

public class CustomModulus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("Input the second number: ");
		int n2 = scanner.nextInt();
		
		int div = n1/n2;
		int mod = n1 - (div * n2);
		System.out.println(mod);
	

	}

}
