package RecursionBasicPart2;
//import java.lang.StringBuilder;
public class RemoveDuplicates {
    public static void removeCharecter(String str,int index, StringBuilder sb){
        
        boolean ar[]=new boolean[26];
        if(index==str.length()){
            System.out.println(sb);
            return;
        } 
        char ch=str.charAt(index);
        if(ar[ch-'a']==true){
            removeCharecter(str, index+1,sb);
        }else{
            ar[ch-'a']=true;
            sb=sb.append(ch);
            removeCharecter(str, index+1, sb);
        }
    }
       public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
       String str="appanacollege";
       removeCharecter(str, 0,sb);
    }
}
