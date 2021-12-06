package assignment;
import java.util.Scanner;

public class DataEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in four numbers of your choice:");
        int number = input.nextInt();
        {
            int num1;
            int num2;
            int num3;
            int num4;

            num1 = number / 1000;
            num2 = (number % 1000) / 100;
            num3 = (number % 100) / 10;
            num4 = (number % 10) / 1;

            num1 = (num1 + 7) % 10;
            //System.out.print(num1);
            num2 = (num2 + 7) % 10;
            //System.out.print(num2);
            num3 = (num3 + 7) % 10;
            //System.out.print(num3);
            num4 = (num4 + 7) % 10;
            //System.out.print(num4);

            System.out.printf("The encrypted data is %d%d%d%d", num3, num4, num1, num2);
        }
    }
}
