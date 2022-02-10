package chapterOne;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        if (numA > 0 || numB <= 0 || numC <= 0){
            if (numB > 0 || numA <= 0 || numC <= 0){
                if (numC > 0 || numA <= 0 || numB <= 0){
                    System.out.println("True");
                }
            }
        }
        else {
            System.out.println("False");
        }

    }

}
