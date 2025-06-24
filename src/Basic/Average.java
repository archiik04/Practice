package Basic;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first number:");
        int n1 = scanner.nextInt();

        System.out.println("second number:");
        int n2 = scanner.nextInt();

        System.out.println("third number:");
        int n3 = scanner.nextInt();

        double average = (n1 + n2 + n3) / 3.0;

        System.out.println("average: " + average);
    }
}

