package TwoD;

public class Sprial {
    public static void SprialPrint(int ar[][],int n, int m){
        int startRow=0;
        int startColm=0;
        int endRow=n;//|
        int endColm=m;//---
        while(startColm<=endColm && startRow<=endRow){
            for(int i=startRow; i<=endRow;i++){
                System.out.print(ar[startColm][i]+" ");
            }
            for(int j=startColm+1; j<=endColm; j++){
                System.out.print(ar[j][endRow]+" ");
            }
            for(int i=endRow-1;i>=startRow; i--){
                if(startColm==endColm){
                    break;
                }
                System.out.print(ar[endColm][i]+" ");
            }
            for(int j=endColm-1; j>=startColm+1;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(ar[j][startRow]+" ");
            }
            startRow++;
            startColm++;
            endRow--;
            endColm--;
        }
    }
    public static void main(String[] args){
        int ar[][]={{1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25} };
                    int n=ar.length-1;//|
                    int m=ar[0].length-1;//---

        SprialPrint(ar, n ,m);            
        
    }
}
