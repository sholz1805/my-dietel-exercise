package chapterFive;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
//        (“The Twelve Days of Christmas” Song) Write an application that uses repetition and
//        switch statements to print the song “The Twelve Days of Christmas.” One switch statement should
//        be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
//        to print the remainder of each verse.

        for (int i = 1; i <= 12; i++) {
            System.out.print("On the " + i);

            switch (i) {
                case 1 -> System.out.println("st" + " day of christmas");
                case 2 -> System.out.println("nd" + " day of christmas");
                case 3 -> System.out.println("rd" + " day of christmas");
                default -> System.out.println("th" + " day of christmas");
            }

            System.out.println("My true love sent to me");

            for (int j = i; j > 0 ; j--) {
                switch (j) {
                    case 12 -> System.out.println("Twelve lords a leaping");
                    case 11 -> System.out.println("Eleven ladies dancing");
                    case 10 -> System.out.println("Ten pipers piping");
                    case 9 -> System.out.println("Nine drummers drumming");
                    case 8 -> System.out.println("Eight maids a milking");
                    case 7 -> System.out.println("Seven swans a swimming");
                    case 6 -> System.out.println("Six geese a laying");
                    case 5 -> System.out.println("Five gold rings");
                    case 4 -> System.out.println("Four colley birds");
                    case 3 -> System.out.println("Three French hens");
                    case 2 -> System.out.println("Two turtle doves");
                    case 1 -> System.out.println("A partridge in a pear tree.");

                }
            }
                    System.out.println();
        }
    }
}





