package chapterSeven;

import java.util.Arrays;

public class Learn {
    public static void main(String[] args) {
        int[] array = {2, 7, 16, 1, 43, 23, 8, 4};
        int empty;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                empty = array[i];
                array[i] = array[i + 1];
                array[i+1] = empty;
                for (int j = i; j >= 0 ; j--) {
                    if (array[j+1] < array[j]) {
                        empty = array[j];
                        array[j] = array[j + 1];
                        array[j+1] = empty;
                    }

                }

            }

        }
        System.out.println(Arrays.toString(array));
    }
}
