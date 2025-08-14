package DynamicProgramming.dp1;

import java.util.Arrays;

public class ClimbingStairsMemoizationDP {
    public static int ways(int n, int way[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(way[n] != -1){
            return way[n];
        }
        way[n]=ways(n-1, way)+ways(n-2, way);
        return way[n];
    }

    public static void main(String[] args) {
        int n=5;
        int way[]=new int[n+1];
        Arrays.fill(way, -1);
        System.out.println(ways(n, way));
    }
}
