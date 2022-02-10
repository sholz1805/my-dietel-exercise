package assignment;
//import java.util.Scanner;

public class maths {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int num1 = number / 100;
//        int num2 = (number % 100) / 10;
//        int num3 = (number % 10);
//        System.out.printf("%d %d %d", num3, num2, num1);
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0 || j == 4)
//                    System.out.print("#");
//                else System.out.print(" ");
//            }
//                System.out.println();
//            }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        }

    }