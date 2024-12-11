package TwoD;
import java.util.*;
public class Creat2DArray {
    public static void printArray(int ar[][]){
        int n=ar.length , m=ar[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m ; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        SearchArrayKey(ar,8);
    }
    public static void SearchArrayKey(int ar[][],int k){
        int n=ar.length, m=ar[0].length;
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                if(ar[i][j]==k){
                    System.out.print("Index: ("+i+","+j+")");
                    return;
                }
            }
        }
    }
   public static void main(String[] args){
    System.out.print("hii");
    int ar[][]=new int[3][3];
    Scanner scan = new Scanner(System.in);
    int n=ar.length , m=ar[0].length;
    for(int i=0; i<n;i++){
        for(int j=0; j<m;j++){
            ar[i][j]=scan.nextInt();
        }
    }
    printArray(ar);
   /////////////
   }
}
