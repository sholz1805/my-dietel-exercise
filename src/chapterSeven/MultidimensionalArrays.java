package chapterSeven;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        char [][] ticTacToe = new char[3][3];
        int row;
        int column;
        ticTacToe[0]= new char[]{'X', 'O', 'O'};
        ticTacToe[1]= new char[]{'X', 'X', 'X'};
        ticTacToe[2]= new char[]{'O', 'X', 'O'};
//        for(char[] abc :TicTacToe){
//            System.out.println(abc);
        for(row = 0; row < ticTacToe.length; row++){
            System.out.println();
            for(column = 0; column < ticTacToe[row].length; column++){

                System.out.print(" " + ticTacToe[row][column]);
            }
        }

        }

       // char[][] TicTaToe = new char[][]{{'X', 'O', 'O'}, {'X', 'X', 'X'}, {'O', 'X', 'O'}};
        //for (char[] abc : TicTaToe) {
         //   System.out.println(abc);
        }

