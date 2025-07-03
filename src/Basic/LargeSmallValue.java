package Basic;

import java.util.Scanner;

public class LargeSmallValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("Input the second number: ");
		int n2 = scanner.nextInt();
		
		if(n1>n2){
			System.out.println("Result: " + n1);
		} 
		else if (n1<n2){
			System.out.println("Result: " + n2);
		}
		else if (n1==n2){
			System.out.println("Result: "+ 0);
		}
		else {
			System.out.println("Result: false");
		}
		

	}

}
