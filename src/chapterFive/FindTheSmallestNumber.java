package chapterFive;

import java.util.Scanner;

public class FindTheSmallestNumber {

    //    5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
//    Assume that the first value read specifies the number of values to input from the user.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int min = Integer.MAX_VALUE;

        System.out.println("Input a number");
       int num1 = scanner.nextInt();

        for (int i = 0; i < num1-1 ; i++) {
            System.out.println("input another number");
            int num2 = scanner.nextInt();

            if(num1 < min){
                min = num1;
            } else if(num2 < min){
                min = num2;
            }

        }
        System.out.println(min + " is the smallest number");

    }
}