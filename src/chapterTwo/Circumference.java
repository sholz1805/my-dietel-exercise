package chapterTwo;

import java.util.Scanner;
//2.28 (Diameter, Circumference and Area of a Circle)
public class Circumference {

    public static void main(String[] args){
            Scanner input= new Scanner(System.in);

            System.out.println("Enter the value of Radius");
            int radius= input.nextInt();

            double constantPI= Math.PI;

            System.out.printf("Area of the circle is %f%n",constantPI*radius*radius);

            System.out.printf("Circumference of the circle is %f%n",2*constantPI*radius);

            System.out.printf("Diameter of the circle is %d%n",2*radius);

        }
    }

