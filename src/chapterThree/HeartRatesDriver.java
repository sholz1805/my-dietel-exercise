package chapterThree;

import java.util.Scanner;

public class HeartRatesDriver {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args){

        System.out.println("Enter your first name");
        String name1 = scanner.nextLine();

        System.out.println("Enter your second name");
        String name2 = scanner.nextLine();

        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();

        System.out.println("Enter your month of birth");
        int monthOfBirth = scanner.nextInt();

        System.out.println("Enter your day of birth");
        int dayOfMonth = scanner.nextInt();

        HeartRates heartRates = new HeartRates(name1, name2, yearOfBirth, monthOfBirth, dayOfMonth);

        heartRates.setAgeInYears(yearOfBirth);

        heartRates.calculateHeartRates();

        heartRates.calculateTargetHeartRates();



        System.out.printf("Your full name is %s %s", name1,name2);
        System.out.println();
        System.out.printf("Your date of birth is %d"+"-"+"%d"+"-"+"%d", dayOfMonth,monthOfBirth,yearOfBirth);
        System.out.println();
        System.out.printf("you're %d years old", heartRates.getYear());
        System.out.println();
        System.out.printf("Your maximum heart rate is %d",heartRates.calculateHeartRates());
        System.out.println();
        System.out.printf("Your target heart rate is %.2f", heartRates.calculateTargetHeartRates());
    }

}
