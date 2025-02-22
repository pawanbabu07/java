package Backtracking;

public class Sudoku {
    public static boolean isSafe(int sudo[][],int row,int col,int digit){
        //colume
        for(int i=0;i<9;i++){
            if(sudo[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<9;j++){
            if(sudo[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;sr++){
            for(int j=sc;j<sc+3;sc++){
                if(sudo[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolve(int sudo[][],int row ,int col){
        if(row==9){
            return true;
        }
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudo[row][col]!=0){
            return sudokuSolve(sudo, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudo, row, col, digit)){
                sudo[row][col]=digit;
                if(sudokuSolve(sudo, nextRow, nextCol)){
                    return true;
                }
                sudo[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudo[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudo[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudo[][]={{0, 0, 8, 0, 0, 0, 0, 0, 0},
                      {4, 9, 0, 1, 5, 7, 0, 0, 2},
                      {0, 0, 3, 0, 0, 4, 1, 9, 0},
                      {1, 8, 5, 0, 6, 0, 0, 2, 0},
                      {0, 0, 0, 0, 2, 0, 0, 6, 0},
                      {9, 6, 0, 4, 0, 5, 3, 0, 0},
                      {0, 3, 0, 0, 7, 2, 0, 0, 4},
                      {0, 4, 9, 0, 3, 0, 0, 5, 7},
                      {0, 2, 7, 0, 0, 9, 0, 1, 3}};
        if(sudokuSolve(sudo, 0 ,0)){
            printSudoku(sudo);
        }        
    }
}
