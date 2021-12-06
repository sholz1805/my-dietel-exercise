package chapterTwo;

//2.26 (Multiples) Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result. [Hint: Use the remainder operator.]

import java.util.Scanner;
public class Multiple{
        public static void main(String[] args){
            Scanner scan= new Scanner(System.in);
            int firstNumber;
            int secondNumber;

            System.out.println("Enter a number: ");
            firstNumber= scan.nextInt();

            System.out.println("Enter a number");
            secondNumber=scan.nextInt();


            if(firstNumber%secondNumber==0){
                System.out.printf("%d is a multiple of %d",firstNumber, secondNumber);
            }
            if(firstNumber%secondNumber!=0){
                System.out.printf("%d is not a multiple of %d",firstNumber, secondNumber);
            }
        }
    }