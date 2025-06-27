package Basic;

import java.util.Scanner;

public class DistanceBetweenTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the latitude of coordinate: ");
		double la1 = scanner.nextDouble();
		System.out.println("Input the longitude of coordinate: ");
		double lo1 = scanner.nextDouble();
		System.out.println("Input the latitude of coordinate: ");
		double la2 = scanner.nextDouble();
		System.out.println("Input the longitude of coordinate: ");
		double lo2 = scanner.nextDouble();
		
		System.out.print("The distance between these points is: " + distance_two(la1,lo1,la2,lo2) + "km\n");
	}

	private static double distance_two(double la1, double lo1, double la2, double lo2) {
		la1 = Math.toRadians(la1);
		lo1=Math.toRadians(lo1);
		la2 = Math.toRadians(la2);
		lo2 =Math.toRadians(lo2);
		
		double r = 6371.01;
		return r * Math.acos(Math.sin(la1) * Math.sin(la2) + Math.cos(la1) * Math.cos(la2) * Math.cos(lo1 - lo2));
	}

}
