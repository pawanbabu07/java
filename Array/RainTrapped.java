package Array;


public class RainTrapped{
    public static int trappedRainwater(int number[]){
        int n=number.length;
        int leftMax[]=new int[n];
        leftMax[0]=number[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(number[i], leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=number[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(number[i], rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0; i<n;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater+=waterLevel-number[i];    
        }
        return trappedWater;
    }

    public static void main(String[] args){
        int number[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(number));
    }
}