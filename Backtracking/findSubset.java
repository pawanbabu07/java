package Backtracking;

public class findSubset {
    public static void printSubstring(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("$");
            }
            System.out.println(ans);
            return;
        }
        printSubstring(str, ans, i+1);
        printSubstring(str, ans+str.charAt(i), i+1);
        
    }
    
    public static void main(String args[]){
        String str="abc";
        String ans="";
        printSubstring(str, ans, 0);
    }
}
