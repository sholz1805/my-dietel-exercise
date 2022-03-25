package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int miles;
            int gallons;
            int total=0;
            int count=0;
        System.out.println("enter miles driven per trip ");
        miles = input.nextInt();


            while (miles != -2){
                System.out.println("enter gallons used per trip");
                gallons = input.nextInt();

                double  milesPerGallon = miles / gallons ;

                System.out.printf("you've used %s milesPerGallon on your trip%n", milesPerGallon);
              total += milesPerGallon;
              count++;
                System.out.println("enter miles driven per trip ");
                miles = input.nextInt();

            }
      System.out.printf("the %d trips you calculated miles per gallon for %n" , count);
      System.out.printf("totals %d%n", total);
    }
}
