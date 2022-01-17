package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your radius");
        int radius = scanner.nextInt();
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf(" The diameter of the circle is: %.2f%n", diameter);
        System.out.printf(" The circumference of the circle is: %.2f%n", circumference);
        System.out.printf(" The area of the circle is: %.2f%n", area);

    }
}
