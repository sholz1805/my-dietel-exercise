package chapterSix;

public class GroupC {
    public static void main(String[] args) {
        for (int number = 6; number >= 1; number--) {
            int p=1;
            for (int row = 1; row <= number; row++) {
                System.out.print(" ");
            }
            for (int row = 1; row <= number; row++) {
                System.out.println(p++ +"");
            }
            System.out.println();
        }
    }
}
