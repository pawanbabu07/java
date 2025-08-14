package DynamicProgramming.dp2;

public class Kanpsak01Recursion {
    public static int kanpsak(int val[], int wt[], int w, int n){//O(2^n)
        if(w==0 || n==0){
            return 0;
        }

        if(wt[n-1] <= w){
            //include
            int ans1= val[n-1] + kanpsak(val, wt, w-wt[n-1], n-1);
            //exclude
            int ans2 = kanpsak(val, wt, w, n-1);
            return Math.max(ans1, ans2);
        }else{//not valid
            return kanpsak(val, wt, w, n-1);
        }
    }

    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        System.out.println(kanpsak(val, wt, w, val.length));
    }
}
