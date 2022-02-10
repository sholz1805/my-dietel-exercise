package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        String[][] names = new String[3][3];
        int i;
        int j;

        names[0]= new String[]{"Shao_Khan", "Sub_Zero", "Sonya" };
        names[1]= new String[]{"Kano", "Jax", "Scorpion"};
        names[2]= new String[]{"Liu_Kang", "Kung_Lao", "Millena"};

        for (i = 0; i < names.length; i++) {
                    System.out.println( );
                    for (j = 0; j < names[i].length; j++){
                        System.out.println("Enter a name");

                        Scanner scanner = new Scanner(System.in);
                        names[i][j] = scanner.nextLine();
                    }
//                    System.out.print(names[i][j]+ "  ");
        }
        for (i = 0; i < names.length; i++) {
            System.out.println( );
            for (j = 0; j < names[i].length; j++){
                System.out.printf(names[i][j] +"  ");
            }
//                    System.out.print(names[i][j]+ "  ");
        }
    }
//    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//       for (int i = 0; i < cars.length; i++) {
//        System.out.println(cars[i]);
//        for(String i : cars){
//            System.out.println(i);

    }


