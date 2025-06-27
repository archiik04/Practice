package Basic;

import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the length of the side: ");
		double s1 = scanner.nextDouble();
		System.out.print("The area of the hexagon is: " + hexagonArea(s1) + "\n");
	}
		
	private static double hexagonArea(double s1) {
		return (6 * (s1 * s1)) / (4 * Math.tan(Math.PI / 6));
	}

}


