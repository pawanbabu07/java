package Shorting;

import java.util.Arrays;
import java.util.Collections;
public class Decrement {
public static void main(String[] args){
    Integer arr[]={5,2,9,1,7,3,8,6,4};
    Arrays.sort(arr, Collections.reverseOrder());
    for(int i=0;i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
    
}
