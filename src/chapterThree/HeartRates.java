package chapterThree;

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
    private int day;
    private int month;
    private int year;

//    public static void getDateOfBirth(int day, int month, int year){
//    Scanner scanner = new Scanner(System.in);
//    day = scanner.nextInt(); month = scanner.nextInt(); year = scanner.nextInt();
//        System.out.printf("%2d/%2d/%4d", day, month, year);
//    }
    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setAgeInYears(int year){
        year = 2021 -  year;
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public int calculateHeartRates() {
        int max = 220 - getYear();
        return max;
    }
    public double calculateTargetHeartRates(){
        double target = 0.7 * calculateHeartRates();
        return target;
    }


    }



