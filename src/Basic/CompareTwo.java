package Basic;

import java.util.Scanner;

public class CompareTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First integer: ");
		int n1 = scanner.nextInt();
		System.out.println("Second integer: ");
		int n2 = scanner.nextInt();
		
		if (n1 == n2)
            System.out.printf("%d == %d\n", n1, n2);
        if (n1 != n2)
            System.out.printf("%d != %d\n", n1, n2);
        if (n1 < n2)
            System.out.printf("%d < %d\n", n1, n2);
        if (n1 > n2)
            System.out.printf("%d > %d\n", n1, n2);
        if (n1 <= n2)
            System.out.printf("%d <= %d\n", n1, n2);
        if (n1 >= n2)
            System.out.printf("%d >= %d\n", n1, n2);

	}

}
