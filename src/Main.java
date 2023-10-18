import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1
      /* int [][] doubleArray = new int [5][5];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int value = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++){
                doubleArray [i][j] = random.nextInt(10) + value;
                System.out.print(doubleArray[i][j] + " ");
                sum = doubleArray[i][j] + sum;
            }
            System.out.println("");
        }
        System.out.println( "\n" + "sum = " + sum);*/

        //Task2
       /* String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    if (j % 2 == 0){
                        chessBoard [i][j] = "W";
                    } else {
                        chessBoard [i][j] = "B";
                    }


                }
            } else {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    if (j % 2 != 0){
                        chessBoard [i][j] = "W";
                    } else {
                        chessBoard [i][j] = "B";
                    }


                }
            }
        }
        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard[i].length; j++){
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println("");
        }*/

        //Task*
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int [][] doubleArray = new int [scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < doubleArray.length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < doubleArray[i].length; j++){
                    doubleArray [i][j] = num++;
                }
            } else {
                for (int j = doubleArray[i].length - 1; j >= 0; j--){
                    doubleArray[i][j] = num++;
                }
            }
        }
        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++){
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println("");
        }


    }
}