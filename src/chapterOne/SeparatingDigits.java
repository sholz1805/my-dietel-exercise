package chapterOne;

// prompt users to input five-digit numbers
// separate the numbers into individual digits
// print the numbers with three spaces in between

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.println("Input any 5-digit numbers");
        int num = input.nextInt();

        num1=(num/10000);
        num2=(num%10000)/1000;
        num3=(num%1000)/100;
        num4=(num%100)/10;
        num5=(num%10);

        if (num<5)
            if (num>5){
                System.out.println("Invalid");
            }

        System.out.printf("%d   %d   %d   %d   %d", num1, num2, num3, num4, num5);





    }
    }
