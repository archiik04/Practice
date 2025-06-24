package Basic;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("width: ");
        float width = scanner.nextFloat();
        System.out.print("height: ");
        float height = scanner.nextFloat();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        
    }
}
