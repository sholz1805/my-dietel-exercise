package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
//    6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
//    hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//    hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//    longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//    customer. The program should display the charge for the current customer and should calculate and
//    display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
//    the charge for each customer.

    public static double charges(int hour) {
        double minimumAmount = 2;
        double maximumAmount = 10;
        int minimumHour = 3;

        if(hour <= 3){
           return minimumAmount;
        }
        else if(hour < 24){
          int newHour =  hour - minimumHour;
           return minimumAmount + (0.5 * newHour);
        }
        else {
            return maximumAmount;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many hours the car was parked?");
        int hourUsed = scanner.nextInt();
        System.out.println("Your total charge is :$" + (charges(hourUsed)));

    }
}


