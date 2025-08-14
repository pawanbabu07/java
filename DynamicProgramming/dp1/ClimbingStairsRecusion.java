package DynamicProgramming.dp1;
// Q: count ways to reach the nth stair. the person con climb either 1 stair or 2 stairs at a time.
public class ClimbingStairsRecusion {
    public static int ways(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return ways(n-1)+ways(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(ways(n));
    }
}
