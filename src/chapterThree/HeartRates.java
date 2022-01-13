package chapterThree;

import java.util.Scanner;
import java.time.LocalDate;

public class HeartRates {
//the formula for calculating
//your maximum heart rate in beats per minute is 220 minus your age in years. Your target
//heart rate is a range that’s 50–85% of your maximum heart rate.
// Create a class called HeartRates.
// The class attributes
//should include the person’s first name, last name and date of birth (consisting of separate attributes
//for the month, day and year of birth). Your class should have a constructor that receives this data as
//parameters. For each attribute provide set and get methods. The class also should include a method
//that calculates and returns the person’s age (in years), a method that calculates and returns the person’s
//maximum heart rate and a method that calculates and returns the person’s target heart rate.
//Write a Java app that prompts for the person’s information, instantiates an object of class Heart-
//Rates and prints the information from that object—including the person’s first name, last name and
//date of birth—then calculates and prints the person’s age in (years), maximum heart rate and targetheart-rate range.

    private String firstName;
    private String lastName;
    // private int dateOfBirth;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, int year, int month, int dayOfMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        //  this.dateOfBirth = dateOfBirth;
        dateOfBirth = LocalDate.of(year, month, dayOfMonth);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void calculateHeartRates() {

    }


    public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your first name");
            String name1 = scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter your second name");
            String name2 = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter your year of birth");
            int yearOfBirth = scanner2.nextInt();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter your month of birth");
            int monthOfBirth = scanner3.nextInt();

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter your day of birth");
            int dayOfMonth = scanner4.nextInt();

            HeartRates heartRates = new HeartRates(name1, name2, yearOfBirth, monthOfBirth, dayOfMonth);


        }


    }



