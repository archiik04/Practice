package Basic;

import java.util.Scanner;

public class PolygonArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("The number of sides of the polygon: ");
		double n1 = scanner.nextDouble();
		System.out.println("Input the length of one of the sides: ");
		double s1 = scanner.nextDouble();
		System.out.print("The area is: " + polygonArea(n1, s1) + "\n");
	}

	private static double polygonArea(double n1, double s1) {
		return (n1 * (s1 * s1)) / (4.0 * Math.tan((Math.PI / n1)));
    }
	}


