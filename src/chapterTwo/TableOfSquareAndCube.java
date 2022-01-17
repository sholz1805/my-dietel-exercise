package chapterTwo;

public class TableOfSquareAndCube {
    public static void main(String[] args) {
        //calculate the squares and cubes of 0-10
        //print the result

        int num;
        int square;
        int cube;

        for(num=0; num<=10; num++){
            square= num*num;
            cube= num* num* num;
            System.out.printf("%d  %4d  %4d%n", num, square, cube);
        }

    }
}
