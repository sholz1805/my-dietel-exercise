package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//        data from the user.

            int miles=0;
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
