package Basic;

import java.util.Scanner;

public class CheckSubtraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("Input the second number: ");
		int n2 = scanner.nextInt();
		System.out.println("Input the third number: ");
		int n3 = scanner.nextInt();
		
		if(n1-n2 >=20) {
		
		System.out.println("true");
		}
		else if(n2-n3 >=20){
			System.out.println("true");
		}
		else if(n3-n1 >= 20) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
