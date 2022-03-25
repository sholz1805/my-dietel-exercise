package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLearn {
    public static void main(String[] args) {
//        // collect 10 inputs from user1
//        int[] shola = new int[10];
//        Scanner scanner = new Scanner(System.in);
//        int temp;
//
//        for (int i = 0; i < shola.length; i++) {
//            System.out.println("Enter a number");
//            int number = scanner.nextInt();
//            shola[i] = number;
//        }
//        for (int i = 0; i < shola.length-1; i++) {
////           System.out.print(shola[i] + " ");
//            if (shola[i] < shola[i + 1]){
//                temp = shola[i+1];
//                shola[i+ 1] = shola[i];
//                shola[i] = temp;
//                for (int j = i; j >= 0 ; j--) {
//                        if(shola[j +1] > shola[j]){
//                            temp = shola[j];
//                            shola[j] = shola[j+1];
//                            shola[j+ 1] =temp;
//                        }
//
//                    }
//                }
//
//
//        }
//       System.out.println(Arrays.toString(shola));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b >= c) {
            if (a + c >= b) {
                if (b + c >= a) {
                   System.out.println("YES");
                }
            }
        } else {
            System.out.println("NO");
        }

    }
}