package chapterTwo;

import java.util.Scanner;

public class MinMaxHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 3; i++) {
        System.out.println("Enter 3 numbers");
        int number = input.nextInt();

            if (number > max)
              max = number;
            if (number < min)
              min = number;
        }
        System.out.println("the maximum is: " + max);
        System.out.println("the minimum is: " + min);
    }
}
