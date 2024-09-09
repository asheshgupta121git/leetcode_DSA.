package leetcode;
import java.util.Arrays;
public class SudokuSolver_37 {
    public static void print(char arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
public static boolean helper(char[][]board, int row, int col){
    //base case
    if(row ==9){
        return true;
    }
    // recursion 
    int nrow = row;
    int ncol = col+1;
    if(col +1 == 9){
        nrow = row+1;
        ncol = 0;
    }
    if(board[row][col] != '.'){
        return helper(board,nrow,ncol);
    }
    for(char i = '1'; i<='9';i++){
        if(issafe(board, row,col, i)){
            board[row][col] = i;
            if(helper(board, nrow, ncol)){
                return true;
            }
            board[row][col] ='.';
        }
    }
    return false;
}
public static boolean issafe(char[][]board, int row, int col , char digit){
        for(int i =0;i<9;i++){
        if(board[i][col] == digit){
            return false;
        }
    }
    //check for col 
    for(int j =0;j<9;j++){
        if(board[row][j] == digit){
            return false;
        }
    }
    // check in grid ways
    int sr = (row / 3) * 3;
    int sc = (col/3) * 3;
    for(int i= sr; i<sr+3; i++){
        for(int j= sc; j<sc+3; j++){
            if (board[i][j] == digit) {
                return false;
            }
        }
    }
    return true;
}
public static void solveSudoku(char[][] board) {
    helper(board, 0,0);
}
    public static void main(String[] args) {
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
               
solveSudoku(board);                    
print(board);
    }
}
