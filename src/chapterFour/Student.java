package chapterFour;

import javax.lang.model.util.ElementScanner6;

public class Student {

    //collect student name and average
    private String name;
    private double average;

    //initializing the constructor with the instance variables
    public Student (String name , double average)
    {
        this.name= name;

        if(average>0.00 && average <= 100.00){
            this.average = average;
        }
    }

   //create getter and setter for name
        public void setName(String names){
        name = names;
    }
    public String getName(){
        return name;
    }

    //create getter and setter for average
    public void setAverage(double average){
        if(average>0 && average <=100.00);
        this.average= average;

    }
    public double getAverage(){
        return average;
    }
    public String getLetterGrade(){
        String letterGrade = " ";{

        if (average >= 90)
            //if (average <= 100)
            letterGrade = "A";
            else if (average >= 80 && average <= 89)
                letterGrade = "B";
            else if (average >= 70 && average <= 79)
                letterGrade = "C";
            else if (average >= 60 && average <= 69)
                letterGrade = "D";
            else if (average >=50 && average <=59)
                letterGrade = "E";
            else if (average < 49)
                letterGrade = "F";

            return letterGrade;
        }

    }
}
