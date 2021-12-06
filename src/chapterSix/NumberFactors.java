package chapterSix;

import java.util.Scanner;
public class NumberFactors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int count =0;

        System.out.println("Enter Number");
        number = input.nextInt();

        for (int factor = 1; factor <= number; factor++) {

                if (number % factor == 0) {
                    System.out.println(factor);{
                        count++;}
                }
            }
        System.out.println(count);
    }
    }
