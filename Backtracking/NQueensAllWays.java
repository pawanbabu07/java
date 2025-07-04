package Backtracking;

public class NQueensAllWays {
    public static boolean itSafe(char board[][],int row ,int col){
        //vertical upword direction
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diganal left upword
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diganal right upword
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(itSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board, row+1);//function cakk
                board[row][j]='X';//backtraking step
            }
           
        }
    }
    //for one solution 
    public static boolean nQueenOne(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(itSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueenOne(board, row+1)){
                    return true;
                }
                board[row][j]='X';
            }
           
        }
        return false;
    }
    static int count=0;
    public static void printBoard(char board[][]){
        System.out.println("-------new board----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
            System.out.println();
        }
        if(nQueenOne(board, 0))
        nQueen(board,0);
        System.out.println("No. of solution: "+count);
    }
}
