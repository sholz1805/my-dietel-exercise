package assignment;

import java.util.Scanner;

public class ArrayScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
  //      int[] score = new int[10];
    //    int[] number = new int[10];
      //  int total=0;
        //int max= Integer.MIN_VALUE;
       // int min = Integer.MAX_VALUE;
        //int average = total/10;

        //for(int num =0; num <10; num++) {
          //  System.out.println("Enter Score here");
            //score[num] = input.nextInt();
            //total = total+num;


            //if(num<max){num=max;}
            //if(num>min){num=min;}

        //}

        //System.out.println("Total Score is: "+ total);
        //System.out.println("Average is:" + average);
        //System.out.println("Max is: " + max);
      //  System.out.println("Min is: " + min);
    //}
//}

//{
        int[] scores = new int [10];
        int[] num = new int [10];
        int total = 0;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int score;
        int counter;
        
        for (counter = 0; counter < scores.length; counter ++){
            System.out.println("Enter a score");
            scores[counter] = input.nextInt();
            num[counter] = scores[counter];
            total= total+scores[counter];
            if (minimum > scores[counter]){
                minimum = scores[counter];

            }
            if (maximum < scores[counter]) {
                maximum = scores[counter];
            }

        }
        double average = (double) total/scores.length;
        System.out.println("Print average : "+ average);
        System.out.println("Print maximum : "+ maximum);
        System.out.println("Print minimum : "+ minimum);
        System.out.println("Print total: "+ total);

        for (int i  = 0; i < num.length; i++){
            System.out.print(num[i]+ " ");
        }


    }
}