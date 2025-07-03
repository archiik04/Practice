package Basic;

import java.util.Scanner;

public class SecondstoTime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input the seconds: ");
		
		int n1 = scanner.nextInt();
		
		int s = n1 %60; // seconds
		int h = n1 /60; // second - minute
		int m = h % 60; // left minutes 
		h = h/60; // minute to hour
		
		System.out.print(h + ":" + m + ":" + s + ":");

	}

}
