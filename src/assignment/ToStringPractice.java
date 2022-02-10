package assignment;

import java.sql.SQLOutput;

public class ToStringPractice {

    private String name;
    private int number;

    public ToStringPractice(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return name + number;
    }


    public static void main(String[] args) {
        ToStringPractice toStringPractice = new ToStringPractice("Shola", 15);
        String a = toStringPractice.toString();

        System.out.println(a);
    }
}