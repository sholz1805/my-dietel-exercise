package chapterTwo;

import java.util.Scanner;

    //2.17(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//representation of the average. So, if the sum of the values is 7, the average should be 2, not
//2.3333….]

    public class ArithmeticSmall {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int firstNumber;
            int secondNumber;
            int thirdNumber;
            int sum;
            int average;
            int product;


            System.out.println("Enter first Number");
            firstNumber = input.nextInt();
            System.out.println("Enter second number");
            secondNumber = input.nextInt();
            System.out.println("Enter third number");
            thirdNumber = input.nextInt();
            sum = firstNumber+secondNumber+thirdNumber;
            System.out.printf("sum is %d%n", sum);
            average = (firstNumber+secondNumber+thirdNumber)/3;
            System.out.printf("average is %d%n", average);
            product = firstNumber*secondNumber*thirdNumber;
            System.out.printf("product is %d%n", product);
            if(firstNumber<secondNumber){
                if(firstNumber<thirdNumber){
                    System.out.printf("%d%n is the smallest", firstNumber);
                }
            }
            if(secondNumber<firstNumber){
                if(secondNumber<thirdNumber){
                    System.out.printf("%d%n is the smallest", secondNumber);
                }
            }
            if(thirdNumber<firstNumber){
                if(thirdNumber<secondNumber){
                    System.out.printf("%d%n is the smallest", thirdNumber);
                }
            }

            if(firstNumber>secondNumber){
                if(firstNumber>thirdNumber){
                    System.out.printf("%d%n is the largest", firstNumber);
                }
            }
            if(secondNumber>firstNumber){
                if(secondNumber>thirdNumber){
                    System.out.printf("%d%n is the largest", secondNumber);
                }
            }
            if(thirdNumber>firstNumber){
                if(thirdNumber>secondNumber){
                    System.out.printf("%d%n is the largest", thirdNumber);
                }
            }

        }
    }

