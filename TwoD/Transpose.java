package TwoD;

public class Transpose {
    public static void TrandposeOfMatrix(String ar[][]){
        String newar[][] = new String[ar[0].length][ar.length];
        for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[0].length;j++){
            newar[j][i]=ar[i][j];
        }
        }
       
        for(int i=0;i<newar.length;i++){
            for(int j=0;j<newar[0].length;j++){
                System.out.print(newar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        String ar[][]={
            {"a11","a12","a13","a14","a15"},
            {"b21","b22","b23","b24","b25"},
            {"c31","c32","c33","c34","c35"}
        };
        TrandposeOfMatrix(ar);
    }
}
