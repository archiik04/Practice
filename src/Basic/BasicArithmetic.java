package Basic;

import java.util.Scanner;

public class BasicArithmetic {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("first no: ");
	int n1= scanner.nextInt();
	System.out.println("second no: ");
	int n2= scanner.nextInt();
	int sum  = n1+n2;
	int multiply = n1* n2;
	int subtract = n1-n2;
	int divide = n1/n2;
	int rnum = n1%n2;
	System.out.printf("sum = %d mutliply = %d subtract = %d divide = %d rnum = %d",sum, multiply, subtract, divide, rnum);

	}

}
