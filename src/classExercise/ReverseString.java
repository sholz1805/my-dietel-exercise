package classExercise;

public class ReverseString {
    public static void main(String[] args) {

        String array = "cohort9";
        char[] resultArray = array.toCharArray();

        for (int i = resultArray.length - 1; i >= 0; i--)

            System.out.print(resultArray[i]);
    }
}
