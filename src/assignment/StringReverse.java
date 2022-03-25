package assignment;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();

        char[] reverse = word.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--)

            System.out.print(reverse[i]);
    }
}
