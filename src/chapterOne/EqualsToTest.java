package chapterOne;

import java.util.Scanner;

public class EqualsToTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter 1st Number");
        num1 = input.nextInt();

        System.out.println("Enter 2nd Number");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("NUMBERS ARE EQUAL");
        }
        else
                System.out.println("NUMBERS ARE NOT EQUAL");
        if (num1>num2){
            System.out.println("First Number is Bigger");
        }
        else
            System.out.println("Second Number is Bigger");

        }
    }

