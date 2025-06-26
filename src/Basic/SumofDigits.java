package Basic;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input an integer: ");
		long n1 = scanner.nextLong();
		System.out.println("The sum of the digits is: " + sumDigits(n1));
	}
	
	public static int sumDigits(long n1){
		int sum = 0;
		while (n1!=0) {
			sum+= n1%10;
			n1/=10;
		}
		return sum;
	}

}
