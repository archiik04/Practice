package Basic;

import java.util.Scanner;

public class CountFactors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input an integer: ");
		int n1 = scanner.nextInt();
		System.out.println(result(n1));

	}

	private static int result(int n1) {
		int div = 0;
		for (int i =1; i<=(int) Math.sqrt(n1); i++) {
			if (n1%i==0 && i*i!=n1) {
				div+=2;
				
			} else if(i*i == n1) {
				div++;
			}
		}
		return div;
	}

}
