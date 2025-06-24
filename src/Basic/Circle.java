package Basic;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Radius: ");
		int r1 = scanner.nextInt();
		double pie = 3.14;
		double perimeter = 2 * pie * r1;
		double area = pie * (r1 * r1);
		
		 System.out.println("Perimeter is = " + perimeter);
	     System.out.println("Area is = " + area);

	}

}
