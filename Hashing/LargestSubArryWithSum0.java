package Hashing;

import java.util.HashMap;

public class LargestSubArryWithSum0 {
    public static void main(String[] args) {
        int[] array={15,-2,2,-8,1,7,10,23};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int len=0;
        for(int j=0;j<array.length;j++){
            sum += array[j];
            if(map.containsKey(sum)){
                len=Math.max(len, j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println("max length sum 0 = "+len);
    }
}
