package chapterTwo;
//2.16
//(Comparing Integers) Write an application that asks the user to enter two integers, obtains
//them from the user and displays the larger number followed by the words "is larger". If the numbers
//are equal, print the message "These numbers are equal".
import java.util.Scanner;
public class ComparingIntegers {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int a;
            int b;

            System.out.println("Enter first Number");
            a = input.nextInt();
            System.out.println("Enter second Number");
            b = input.nextInt();
            if(a>b){
                System.out.printf("%d%n is larger", a);
            }
            if(b>a){
                System.out.printf("%d%n is larger",b);
            }
            if(a==b){
                System.out.println("equal");
            }

        }
    }
