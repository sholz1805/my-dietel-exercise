package chapterSix;

public class Kata {

    public static String gradeChecker(int score) {

            if (score >= 90) {return "A";}
            if (score >= 80) {return "B";}
            if (score >= 70 && score < 80) {return "C";}
            if (score >= 60 && score < 70) {return "D";}
            if (score < 60) {return "F";}
        return "";
    }
}




