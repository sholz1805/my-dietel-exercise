package chapterTwo;

import java.util.Scanner;

public class BodyMaxIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight;
        double height;
        double BMI;

        System.out.println("Enter weight in kg");
        weight = input.nextDouble();
        System.out.println("Enter height in meters");
        height = input.nextDouble();

        BMI = weight / (height * height);
        System.out.printf("The Value of Your Body Max Index is: %.2f", BMI);

        System.out.println();

        if (BMI <= 18.5) {
            System.out.println("You're Underweight");
        }
        if (BMI > 18.5 && BMI <= 24.9) {
            System.out.println("You're Normal");
        }
        if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You're Overweight");
        }
        if (BMI >= 30) {
            System.out.println("Obese");
        }
    }
}