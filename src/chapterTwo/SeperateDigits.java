package chapterTwo;

    //2.30 (Separating the Digits in an Integer)

import java.util.Scanner;
public class SeperateDigits {
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            int firstDigit;
            int secondDigit;
            int thirdDigit;
            int fourthDigit;
            int fifthDigit;

            System.out.println("Enter a valid number");
            int scannedValue= input.nextInt();

            firstDigit=scannedValue/10000;
            System.out.println(firstDigit);

            secondDigit=(scannedValue%10000)/1000;
            System.out.println(secondDigit);

            thirdDigit=(scannedValue%1000)/100;
            System.out.println(thirdDigit);

            fourthDigit=(scannedValue%100)/10;
            System.out.println(fourthDigit);

            fifthDigit=(scannedValue%10)/1;
            System.out.println(fifthDigit);

            System.out.printf("%d   %d   %d   %d   %d", firstDigit,secondDigit, thirdDigit, fourthDigit, fifthDigit);

        }
    }

