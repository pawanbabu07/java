package TwoD;

public class SortedMatrix {
    public static boolean StaireSearch(int ar[][], int k){
        int row=0, colm=ar[0].length-1;
        while(row<ar.length && colm>=0){
            if(k==ar[row][colm]){
                System.out.println(row+" "+colm);
                return true;
            }else if(k<ar[row][colm]){
                colm--;
            }else{
                row++;
            }
        }
        //System.out.println("element not found");
        return false;
    }
    public static void main(String[] args){
        int ar[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        StaireSearch(ar, 33);
    }
}
