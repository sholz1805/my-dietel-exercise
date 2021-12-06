package chapterTwo;

//2.15(Arithmetic) Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division). Use the techniques
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int firstNumber;
                int secondNumber;
                int sum;
                int product;
                int difference;
                int quotient;

                System.out.println("Enter first Number");
                firstNumber = input.nextInt();
                System.out.println("Enter second number");
                secondNumber = input.nextInt();
                sum = firstNumber+secondNumber;
                System.out.printf("sum is %d%n", sum);
                product = firstNumber*secondNumber;
                System.out.printf("product is %d%n", product);
                difference = firstNumber-secondNumber;
                System.out.printf("difference is %d%n", difference);
                quotient = firstNumber/secondNumber;
                System.out.printf("quotient is %d%n", quotient);

            }
        }
