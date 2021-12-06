package chapterSix;

public class GroupD {
    public static void main(String[] args) {
        for (int number = 1; number <=6 ; number++) {
            int p=1;
            for (int row = 1; row <= number; row++) {
                System.out.print("  ");
            }
           // System.out.println();
            for (int row = number; row <= 6 ; row++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }

    }
}
