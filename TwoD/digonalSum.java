package TwoD;

public class digonalSum {
    public static void digSum(int ar[][]){
        int sum=0;
       
        for(int i=0;i<ar.length;i++){
            for(int j=0; j<ar.length; j++){
                if(i==j){
                    sum+=ar[i][i];
                }
                if(i!=j&&ar.length-1==(i+j)){
                    sum+=ar[i][j];
                }
            }
           
        } 
        System.out.println(sum);
        
    }
    public static void main(String[] args){
        int ar[][]={{1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25}};

                    digSum(ar);

    }
    
}
