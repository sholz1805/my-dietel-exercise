package chapterTwo;

    //2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
    //of 2 leaves a remainder of 0 when divided by 2.]

import java.util.Scanner;
    public class OddOrEven{
        public static void main(String[] args){
            Scanner scan= new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number= scan.nextInt();

            if(number%2==0){
                System.out.printf("%d is an even number", number);
            }
            if(number%2==1){
                System.out.printf("%d is an odd number", number);
            }
        }
    }

