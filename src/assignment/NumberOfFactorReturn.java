package assignment;

import java.util.Scanner;

public class NumberOfFactorReturn {
        //a method that takes in a number and returns the number of its factors
        int count =0;
        public void factorReturn(int number){
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            for (int i = 1; i < number; i++) {
                if(number % i == 0){
                    count++;
                }
            }
            System.out.println(number +"has"+ count + "factors");
        }

//
//    public static void main(String[] args) {
//            factorReturn(12);
//
//    }

}


