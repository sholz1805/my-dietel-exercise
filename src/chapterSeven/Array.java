package chapterSeven;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int row;
        int column = 0;

        String[][] students = new String[3][3];

        for (row = 0; row < students.length; row++) {
            for (column = 0; column < students[row].length; column++) {

                name = scanner.nextLine();
                students[row][column] = name;

            }

        }
            for(row =0;row<students.length;row++) {
                System.out.println();
                for (column = 0; column < students[row].length; column++) {

                    System.out.print(" " + students[row][column]);
                }
            }

    }
}

