package Backtracking;
import java.util.*;

public class Backtracking_question {
    // all possible combination of a string ==> O(n * n!)
    public static void permutationOfString(String str,String perm, int n){

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char curr = str.charAt(i);
            String neString = str.substring(0, i) + str.substring(i+1);
            
            permutationOfString(neString, perm + curr, n+1);
        }

    }

    // N-Queen Problem start
    public static boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int i = 0; i<board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        // vertically
        for(int i = 0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // upper left
        int r = row;
        for(int c = col; c>=0 && r>=0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper right;
         r = row;
        for(int c = col; c<board.length && r >=0; r--, c++ ){
            if(board[r][c] == 'Q') {
                return false;}
        }

          //lower left
       r = row;
       for(int c=col; c>=0 && r<board.length; r++, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }

         //lower right
         for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       return true; 


    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){

        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++){

            row = "";
           for(int j=0; j<board[0].length; j++) {
               if(board[i][j] == 'Q')
                   row += 'Q';
               else
                   row += '.';


        }

    }

    allBoards.add(newBoard);

    }

    public static void helper (List<List<String>> allBoard, char[][] borad,int col){
        if(col == borad.length){
            saveBoard(borad,allBoard);
            return;
        }
        for(int row = 0; row <borad.length; row++){
            if(isSafe(row,col,borad)){
                borad[row][col] = 'Q';
                helper(allBoard, borad, col+1);
                borad[row][col] ='.';


            }
        }

    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char [][] board = new char[n][n];
        helper(allBoards, board, 0);

        return allBoards;

    }

    public static void main(String[] args) {

        String x = "abc";
        permutationOfString(x, "", 0);
        
    }
    
}
