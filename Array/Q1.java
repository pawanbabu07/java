package Array;

public class Q1 {
    public static int  search(int num[],int k){
        for(int i=0;i<=20;i++){
            if(num[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int k=10;
        int result=search(num,k);
        if(result!=-1){
            System.out.println("Number found at indux "+result);
        }else{
            System.out.println("Number not found");
        }

   }
}
