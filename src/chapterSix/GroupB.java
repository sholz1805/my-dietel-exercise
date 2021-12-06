package chapterSix;

public class GroupB {
    public static void main(String[] args) {

        for (int number = 6; number >=1; number--) {
            for (int row = 1; row <= number; row++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}