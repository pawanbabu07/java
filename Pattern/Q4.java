package Pattern;

public class Q4 {
    public static void main(String[] args){
        int n= 5;
        int s=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                s+=1;
                System.out.print(s+"");
            }
            System.out.println();
        }
    }
    
}
