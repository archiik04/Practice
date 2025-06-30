package Basic;

import java.util.Scanner;

public class SumEqualsThird {

	public static void main(String[] args) {
		//have to take 3 input
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the first number: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Input the second number: ");
		int n2 = scanner.nextInt();
		
		System.out.println("Input the third number: ");
		int n3 = scanner.nextInt();
		
		int sum = n1 + n2;
		
		if (sum == n3) {
            System.out.println("The result: true");
        } else {
            System.out.println("The result: false");
        }
    }
}