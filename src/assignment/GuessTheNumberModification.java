package assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {
     
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumbers = new SecureRandom();
            int rightnumber = randomNumbers.nextInt(1000);
            int number;

            do{
                System.out.println("Guess the number");
                number = input.nextInt();
                if(number==rightnumber) {
                    System.out.println("Congratulations! you guessed the number");
                }
                if(number < rightnumber) {
                    System.out.println("Too low, try again");

                }
                if(number>rightnumber){
                    System.out.println("Too high. try again");

                }

            }
            while (number != rightnumber);

        }
}
