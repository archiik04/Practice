package Basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Required table number: ");
		int m1 = scanner.nextInt();
		
		for (int i=0; i<10; i++) {
			System.out.println(m1 + "x" + (i+1) + "=" + (m1*(i+1)));
			
		}

	}

}

