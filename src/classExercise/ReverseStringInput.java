package classExercise;

import java.util.Scanner;

public class ReverseStringInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word of your choice");
        String arrayInput = scanner.nextLine();
        char[] resultArray = arrayInput.toCharArray();

        for (int i = resultArray.length - 1; i >= 0; i--)

            System.out.print(resultArray[i]);
    }

}
