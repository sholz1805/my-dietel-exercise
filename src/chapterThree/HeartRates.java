package chapterThree;

public class HeartRates {


    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

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



