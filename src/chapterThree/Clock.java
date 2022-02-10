package chapterThree;

public class Clock {
//    (Clock Class) Create a class called Clock that includes three instance variables—an hour
//            (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
//    three instance variables and assumes that the values provided are correct. Provide a set and a get
//    method for each instance variable. The set method should set the value of all three variables to 0 if
//    the value of hour is more than 23, the value of minute is more than 59, and the value of second is
//    more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
//    a test app named ClockTest that demonstrates class Clock’s capabilities.

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        confirm(hour);
        check(minute);
        validate(second);
    }
    public void setHour(int hour) {
        confirm(hour);
    }
    public int getHour(){
        return hour;
    }

    public void setMinute(int minute){
        check(minute);
    }
    public int getMinute(){
        return minute;
    }

    public void setSecond(int second){
        validate(second);
    }
    public int getSecond(){
        return second;
    }

    public void displayTime(){
        this.hour = getHour();
        this.minute = getMinute();
        this.second = getSecond();

        System.out.println(hour + ":" + minute + ":" + second);

        }




    private void validate(int second) {
        if (second > 59) {
            second = 0;
        }
        this.second = second;
    }
    private void check(int minute) {
        if(minute > 59){
            minute = 0;
        }
        this.minute = minute;
    }
    private void confirm(int hour) {
        if (hour > 23) {
            hour = 0;
        }
        this.hour = hour;
    }

    }

