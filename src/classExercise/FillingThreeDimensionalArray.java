package classExercise;

import java.util.Random;

public class FillingThreeDimensionalArray {
    public static void main(String[] args) {

        Random random = new Random();
        int [][][] array = new int[3][3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                for (int k = 0; k < array[1][j].length ; k++) {
                    array[i][j][k] =  10 + random.nextInt(40);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
