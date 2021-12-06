package chapterTwo;

import java.util.Scanner;

//2.24
//(Largest and Smallest Integers) Write an application that reads five integers and determines
//and prints the largest and smallest integers in the group. Use only the programming techniques you
//learned in this chapter.


    public class LargestSmallest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int number3;
            int number4;
            int number5;

            System.out.println("Enter first Number");
            number1 = input.nextInt();
            System.out.println("Enter second Number");
            number2 = input.nextInt();
            System.out.println("Enter third Number");
            number3 = input.nextInt();
            System.out.println("Enter fourth Number");
            number4 = input.nextInt();
            System.out.println("Enter fifth Number");
            number5 = input.nextInt();

            if (number1 > number2) {
                if (number1 > number3) {
                    if(number1>number4){
                        if(number1>number5){
                            System.out.printf("%d%n is Largest", number1);
                        }
                    }
                }

            }
            if (number1 < number2) {
                if (number1 < number3) {
                    if(number1<number4){
                        if(number1<number5){
                            System.out.printf("%d%n is Smallest", number1);
                        }
                    }
                }

            }
            if (number2 > number1) {
                if (number2 > number3) {
                    if(number2>number4){
                        if(number2>number5){
                            System.out.printf("%d%n is Largest", number2);
                        }
                    }
                }

            }
            if (number2 < number1) {
                if (number2 < number3) {
                    if(number2<number4){
                        if(number2<number5){
                            System.out.printf("%d%n is Smallest", number2);
                        }
                    }
                }

            }
            if (number3 > number1) {
                if (number3 > number2) {
                    if(number3>number4){
                        if(number3>number5){
                            System.out.printf("%d%n is Largest", number3);
                        }
                    }
                }

            }
            if (number3 < number1) {
                if (number3 < number2) {
                    if(number3<number4){
                        if(number3<number5){
                            System.out.printf("%d%n is Smallest", number3);
                        }
                    }
                }

            }
            if (number4 > number1) {
                if (number4 > number2) {
                    if(number4>number3){
                        if(number4>number5){
                            System.out.printf("%d%n is Largest", number4);
                        }
                    }
                }

            }
            if (number4 < number1) {
                if (number4 < number2) {
                    if(number4<number3){
                        if(number4<number5){
                            System.out.printf("%d%n is Smallest", number4);
                        }
                    }
                }

            }
            if (number5 > number1) {
                if (number5 > number2) {
                    if(number5>number3){
                        if(number5>number4){
                            System.out.printf("%d%n is Largest", number5);
                        }
                    }
                }

            }
            if (number5 < number1) {
                if (number5 < number2) {
                    if(number5<number3){
                        if(number5<number4){
                            System.out.printf("%d %n is Smallest", number5);
                        }
                    }
                }

            }

        }
    }


