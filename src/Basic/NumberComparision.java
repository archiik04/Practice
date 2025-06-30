package Basic;

import java.util.Scanner;

public class NumberComparision {

	public static void main(String[] args) {
		// 3 numbers 2>1 & 3>2 
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("Input the second number: ");
		int n2 = scanner.nextInt();
		System.out.println("Input the third number: ");
		int n3 = scanner.nextInt();
		
		if (n2>n1 && n3>n2) {
			System.out.println("The result is: true");
		}
		else {
			System.out.println("The result is: false");
		}

	}

}
