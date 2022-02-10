package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    private  double hourlyRate;
    private  int hours;
    private String name;


    public SalaryCalculator(String name, int hours, double hourlyRate) {
        this.name = name;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateHourlyRate() {
        if (hours > 40){
            int extraHour = hours - 40;
            double extraPay = (1.5 * hourlyRate) * extraHour;
            double grossPay = hourlyRate * 40;
            return extraPay + grossPay;

        }
        else {
            return hourlyRate * hours;
        }

    }


//    private static Scanner scanner = new Scanner(System.in);
////    4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
////    three employees. The company pays straight time for the first 40 hours worked by each employee
////    and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
////    number of hours worked last week and their hourly rates. Your program should input this information
////    for each employee, then determine and display the employee’s gross pay. Use class Scanner to input the data.
//
//    private String employeeName;
//    private int hours;
//    private double hourlyRate;
//
//    public SalaryCalculator(String employeeName, int hours, double hourlyRate) {
//        this.employeeName = employeeName;
//        this.hours = hours;
//        this.hourlyRate = hourlyRate;
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public void setHours(int hours) {
//        this.hours = hours;
//    }
//
//    public double getHourlyRate() {
//        return hourlyRate;
//    }
//
//    public void setHourlyRate(double hourlyRate) {
//        this.hourlyRate = hourlyRate;
//    }
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public double calculateEmployeeWage(double hourlyRate, int hours){
//        boolean hoursIsGreaterThanForty = hours > 40;
//        if (hoursIsGreaterThanForty){
//            int newHour = hours - 40;
//            double extraPay = ((hourlyRate * 1.5)*newHour);
//            double grossPay = (hourlyRate * 40);
//            return grossPay + extraPay;
//        }
//        else
//            return hourlyRate * hours;
//
//    }
//
//    public static void main(String[] args) {
//
//        String userName = input("Enter the employee name: ");
//
//        display("Enter the hourly rates: ");
//        double hourlyRate = scanner.nextDouble();
//
//        display("Enter the hours worked");
//        int hours  = scanner.nextInt();
//
//        SalaryCalculator salaryCalculator = new SalaryCalculator(userName,hours,hourlyRate);
//        double grossPay = salaryCalculator.calculateEmployeeWage(hourlyRate,hours);
//
//        System.out.printf("%s gross pay is %.2f", salaryCalculator.getEmployeeName(),grossPay);
//    }
//
//    public static String input(String message){
//        System.out.println(message);
//        return scanner.nextLine();
//    }
//
//    public static double input(){
//        return scanner.nextDouble();
//    }
//
//    public static void display(String message){
//        System.out.println(message);
//    }

}
