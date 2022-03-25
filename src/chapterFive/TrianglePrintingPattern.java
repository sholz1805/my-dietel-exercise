package chapterFive;

public class TrianglePrintingPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

        System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=6; i++){
            for (int j = 6 ; j>= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=6; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int column2 = i; column2 <= 6; column2++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=6; i++){
            for (int j = 6 ; j>= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        }
    }
